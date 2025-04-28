// src/composables/useBalance.ts

import { ref, watch } from 'vue';
import { Connection, PublicKey, clusterApiUrl } from '@solana/web3.js';
import { publicKey } from './WalletProvider';

export const solBalance = ref<number | null>(null);

// Setup Solana connection
const connection = new Connection(clusterApiUrl('mainnet-beta'), 'confirmed');

/**
 * Fetches SOL balance for the connected wallet.
 */
export async function fetchSolBalance(walletAddress: string) {
  try {
    const pubKey = new PublicKey(walletAddress);
    const balanceLamports = await connection.getBalance(pubKey);
    solBalance.value = balanceLamports / 1e9; // Convert Lamports to SOL
  } catch (error) {
    console.error('Error fetching SOL balance:', error);
    solBalance.value = null;
  }
}

// Auto-fetch balance when publicKey changes
watch(publicKey, (newKey) => {
  if (newKey) {
    fetchSolBalance(newKey);
  } else {
    solBalance.value = null;
  }
});
