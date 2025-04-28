// src/composables/useTokenBalances.ts

import { ref, watch, onUnmounted } from 'vue';
import { Connection, PublicKey, clusterApiUrl } from '@solana/web3.js';
import { publicKey } from './WalletProvider';

interface TokenBalance {
  mint: string;
  amount: number;
  decimals: number;
}

export const tokenBalances = ref<TokenBalance[]>([]);

const connection = new Connection(clusterApiUrl('mainnet-beta'), 'confirmed');

// Refresh Interval ID
let refreshIntervalId: ReturnType<typeof setInterval> | null = null;

/**
 * Fetches all SPL Token balances for the connected wallet.
 */
async function fetchTokenBalances(walletAddress: string) {
  try {
    const pubKey = new PublicKey(walletAddress);
    const tokenAccounts = await connection.getParsedTokenAccountsByOwner(pubKey, {
      programId: new PublicKey('TokenkegQfeZyiNwAJbNbGKPFXCWuBvf9Ss623VQ5DA'), // SPL Token Program ID
    });

    const tokens: TokenBalance[] = [];

    tokenAccounts.value.forEach((accountInfo) => {
      const data = accountInfo.account.data.parsed.info;
      const amount = parseFloat(data.tokenAmount.uiAmountString || '0');
      const decimals = data.tokenAmount.decimals;
      if (amount > 0) {
        tokens.push({
          mint: data.mint,
          amount,
          decimals,
        });
      }
    });

    tokenBalances.value = tokens;
  } catch (error) {
    console.error('Error fetching token balances:', error);
    tokenBalances.value = [];
  }
}

/**
 * Start auto-refreshing token balances every 60 seconds.
 */
function startAutoRefresh(walletAddress: string) {
  if (refreshIntervalId) clearInterval(refreshIntervalId);

  refreshIntervalId = setInterval(async () => {
    await fetchTokenBalances(walletAddress);
  }, 60_000);
}

/**
 * Stop auto-refreshing.
 */
function stopAutoRefresh() {
  if (refreshIntervalId) {
    clearInterval(refreshIntervalId);
    refreshIntervalId = null;
  }
}

// Watch for wallet connect/disconnect
watch(publicKey, (newKey) => {
  if (newKey) {
    fetchTokenBalances(newKey);
    startAutoRefresh(newKey);
  } else {
    tokenBalances.value = [];
    stopAutoRefresh();
  }
});

// Clean up on page destroy
onUnmounted(() => {
  stopAutoRefresh();
});

<script lang="ts">
import { tokenBalances } from '@/composables/useTokenBalances';
import { getTokenMetadata } from '@/composables/useTokenMetadata';
</script>

<template>
  <div v-if="tokenBalances.length">
    <h2>Your Token Balances:</h2>
    <ul>
      <li v-for="token in tokenBalances" :key="token.mint" class="token-item">
        <img
          v-if="getTokenMetadata(token.mint)?.logoURI"
          :src="getTokenMetadata(token.mint)?.logoURI"
          alt="token logo"
          class="token-logo"
        />
        <span class="token-symbol">
          {{ getTokenMetadata(token.mint)?.symbol || 'Unknown' }}
        </span>
        :
        <span class="token-amount">{{ token.amount }}</span>
      </li>
    </ul>
  </div>
</template>

<style scoped>
.token-item {
  display: flex;
  align-items: center;
  gap: 8px;
  margin-bottom: 8px;
}
.token-logo {
  width: 24px;
  height: 24px;
  border-radius: 50%;
}
.token-symbol {
  font-weight: bold;
}
.token-amount {
  font-family: monospace;
}
</style>
