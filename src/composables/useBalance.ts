// src/composables/useBalance.ts

import { ref, watch, onUnmounted } from 'vue';
import { Connection, PublicKey, clusterApiUrl } from '@solana/web3.js';
import { publicKey } from './WalletProvider';

export const solBalance = ref<number | null>(null);

const connection = new Connection(clusterApiUrl('mainnet-beta'), 'confirmed');

// Refresh Interval ID
let refreshIntervalId: ReturnType<typeof setInterval> | null = null;

/**
 * Fetch SOL balance from Solana RPC
 */
export async function fetchSolBalance(walletAddress: string) {
  try {
    const pubKey = new PublicKey(walletAddress);
    const balanceLamports = await connection.getBalance(pubKey);
    solBalance.value = balanceLamports / 1e9; // Lamports to SOL
  } catch (error) {
    console.error('Error fetching SOL balance:', error);
    solBalance.value = null;
  }
}

/**
 * Start auto-refreshing the balance every 60 seconds
 */
function startAutoRefresh(walletAddress: string) {
  // Clear existing interval if any
  if (refreshIntervalId) clearInterval(refreshIntervalId);

  refreshIntervalId = setInterval(async () => {
    await fetchSolBalance(walletAddress);
  }, 60_000); // 60,000ms = 60 seconds
}

/**
 * Stop auto-refreshing the balance
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
    fetchSolBalance(newKey);
    startAutoRefresh(newKey);
  } else {
    solBalance.value = null;
    stopAutoRefresh();
  }
});

// Clean up on page destroy
onUnmounted(() => {
  stopAutoRefresh();
});
