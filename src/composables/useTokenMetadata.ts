// src/composables/useTokenMetadata.ts

import { ref, onMounted } from 'vue';
import { TokenListProvider, TokenInfo } from '@solana/token-registry';

export const tokenMetadataMap = ref<Map<string, TokenInfo>>(new Map());

/**
 * Fetch and cache the Solana Token List metadata.
 */
async function fetchTokenMetadata() {
  try {
    const tokens = await new TokenListProvider().resolve();
    const tokenList = tokens.filterByChainId(101).getList(); // 101 = Solana Mainnet Beta

    const metadata = new Map<string, TokenInfo>();

    tokenList.forEach((token) => {
      metadata.set(token.address, token);
    });

    tokenMetadataMap.value = metadata;
  } catch (error) {
    console.error('Error fetching token metadata:', error);
  }
}

// Automatically fetch on mount
onMounted(() => {
  fetchTokenMetadata();
});

/**
 * Utility function to lookup token metadata by mint address.
 */
export function getTokenMetadata(mintAddress: string): TokenInfo | undefined {
  return tokenMetadataMap.value.get(mintAddress);
}
