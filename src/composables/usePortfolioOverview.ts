// src/composables/usePortfolioOverview.ts

import { computed } from 'vue';
import { userWalletTokens } from '@/composables/useUserWalletTokens';
import { tokenPrices } from '@/composables/useTokenValue';

export function usePortfolioOverview() {
  const totalValue = computed(() => {
    let sum = 0;
    for (const [mint, amount] of userWalletTokens.value.entries()) {
      const priceData = tokenPrices.value.get(mint);
      if (priceData) {
        sum += (amount / Math.pow(10, priceData.decimals)) * priceData.priceUsd;
      }
    }
    return sum.toFixed(2);
  });

  const tokenPerformance = computed(() => {
    const performances: { mint: string, symbol: string, priceChange: number }[] = [];
    for (const [mint, priceData] of tokenPrices.value.entries()) {
      performances.push({
        mint,
        symbol: priceData.symbol,
        priceChange: priceData.change24h || 0,
      });
    }
    performances.sort((a, b) => b.priceChange - a.priceChange);
    return performances;
  });

  return {
    totalValue,
    tokenPerformance,
  };
}
