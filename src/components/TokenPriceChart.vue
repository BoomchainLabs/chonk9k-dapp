<script lang="ts">
import { defineComponent, watch } from 'vue';
import { Line } from 'vue-chartjs';
import { useTokenChart } from '@/composables/useTokenChart';

export default defineComponent({
  name: 'TokenPriceChart',
  props: {
    symbol: {
      type: String,
      required: true,
    },
  },
  components: {
    Line,
  },
  setup(props) {
    const { priceHistory, timeStamps, fetchTokenHistory } = useTokenChart();

    watch(
      () => props.symbol,
      (newSymbol) => {
        if (newSymbol) {
          fetchTokenHistory(newSymbol);
        }
      },
      { immediate: true }
    );

    return { priceHistory, timeStamps };
  },
});
</script>

<template>
  <div>
    <Line
      v-if="priceHistory.length"
      :data="{
        labels: timeStamps,
        datasets: [{
          label: `${symbol} Price (USD)`,
          backgroundColor: '#42A5F5',
          borderColor: '#1E88E5',
          data: priceHistory,
          fill: true,
          tension: 0.4,
        }],
      }"
      :options="{
        responsive: true,
        plugins: { legend: { display: true } },
        scales: {
          x: { display: true },
          y: { display: true, beginAtZero: false },
        },
      }"
    />
  </div>
</template>
