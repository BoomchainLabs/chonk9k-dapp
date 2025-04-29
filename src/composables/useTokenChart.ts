// src/composables/useTokenChart.ts

import { ref } from 'vue';
import axios from 'axios';

const COINGECKO_API_URL = 'https://api.coingecko.com/api/v3/coins';

export function useTokenChart() {
  const priceHistory = ref<number[]>([]);
  const timeStamps = ref<string[]>([]);

  async function fetchTokenHistory(symbol: string) {
    try {
      const response = await axios.get(`${COINGECKO_API_URL}/${symbol.toLowerCase()}/market_chart`, {
        params: {
          vs_currency: 'usd',
          days: 1, // Last 24 hours
          interval: 'hourly',
        },
      });

      const prices = response.data.prices; // [timestamp, price]
      priceHistory.value = prices.map(([_, price]: [number, number]) => price);
      timeStamps.value = prices.map(([timestamp]: [number, number]) =>
        new Date(timestamp).toLocaleTimeString([], { hour: '2-digit', minute: '2-digit' })
      );
    } catch (error) {
      console.error('Error fetching token price history:', error);
    }
  }

  return {
    priceHistory,
    timeStamps,
    fetchTokenHistory,
  };
}
