<script lang="ts">
import { defineComponent } from 'vue';
import { usePortfolioOverview } from '@/composables/usePortfolioOverview';
import { Pie } from 'vue-chartjs';

export default defineComponent({
  name: 'PortfolioOverview',
  components: { Pie },
  setup() {
    const { totalValue, tokenPerformance } = usePortfolioOverview();
    return { totalValue, tokenPerformance };
  },
});
</script>

<template>
  <div class="portfolio-overview">
    <h2>My Portfolio</h2>

    <div class="summary">
      <h3>Total Value: ${{ totalValue }}</h3>
    </div>

    <div class="performance">
      <h4>Top Gainer: {{ tokenPerformance[0]?.symbol }} ({{ tokenPerformance[0]?.priceChange.toFixed(2) }}%)</h4>
      <h4>Top Loser: {{ tokenPerformance.slice(-1)[0]?.symbol }} ({{ tokenPerformance.slice(-1)[0]?.priceChange.toFixed(2) }}%)</h4>
    </div>

    <div class="allocation-chart">
      <Pie
        v-if="tokenPerformance.length"
        :data="{
          labels: tokenPerformance.map(tp => tp.symbol),
          datasets: [{
            backgroundColor: [
              '#FF6384', '#36A2EB', '#FFCE56', '#8AFFC1', '#FFC8A2',
              '#A2FFEA', '#D3A2FF', '#A2B8FF', '#FFD8A2', '#A2FFA9',
            ],
            data: tokenPerformance.map(tp => Math.abs(tp.priceChange)), // Simulate weight for visual
          }],
        }"
        :options="{
          responsive: true,
          plugins: { legend: { display: true } },
        }"
      />
    </div>
  </div>
</template>

<style scoped>
.portfolio-overview {
  padding: 2rem;
  background: #f5f7fa;
  border-radius: 12px;
  box-shadow: 0 2px 8px rgba(0,0,0,0.1);
}
.summary, .performance {
  margin-bottom: 1.5rem;
}
h2, h3, h4 {
  margin: 0.5rem 0;
}
.allocation-chart {
  max-width: 400px;
  margin: auto;
}
</style>
