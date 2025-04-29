// src/composables/usePriceAlert.ts

import { ref } from 'vue';
import { tokenPrices } from '@/composables/useTokenValue';

const alerts = ref<Map<string, number>>(new Map());

export function usePriceAlert() {
  function setPriceAlert(mint: string, targetPrice: number) {
    alerts.value.set(mint, targetPrice);
  }

  function checkAlerts() {
    for (const [mint, target] of alerts.value.entries()) {
      const priceInfo = tokenPrices.value.get(mint);
      if (priceInfo && priceInfo.priceUsd >= target) {
        alert(`Price Alert: ${priceInfo.symbol} has reached $${target}!`);
        alerts.value.delete(mint); // Optional: Remove after alert
      }
    }
  }

  // Call checkAlerts every 60 seconds
  setInterval(checkAlerts, 60000);

  return {
    setPriceAlert,
  };
}
