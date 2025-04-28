<template>
  <header class="wallet-header flex items-center justify-between p-4 bg-gray-900 text-white">
    <div class="branding">
      <slot name="branding">
        <h1 class="text-xl font-bold">Chonk9k</h1>
      </slot>
    </div>

    <div v-if="publicKey" class="wallet-info flex items-center gap-4">
      <span class="network">{{ networkName }}</span>
      <span class="address">{{ truncatedPublicKey }}</span>
      <button @click="disconnect" class="disconnect-btn">Disconnect</button>
    </div>

    <div v-else>
      <button @click="$emit('open-wallet-modal')" class="connect-btn">Connect Wallet</button>
    </div>
  </header>
</template>

<script lang="ts">
import { defineComponent, computed } from 'vue';
import { publicKey, disconnectWallet } from '@/composables/WalletProvider';

export default defineComponent({
  name: 'WalletHeader',
  setup() {
    const truncatedPublicKey = computed(() => {
      if (!publicKey.value) return '';
      return publicKey.value.slice(0, 4) + '...' + publicKey.value.slice(-4);
    });

    const networkName = computed(() => {
      // Static for now; dynamically detect in future versions (Mainnet-Beta, Devnet, etc.)
      return 'Solana Mainnet';
    });

    const disconnect = async () => {
      await disconnectWallet();
    };

    return {
      publicKey,
      truncatedPublicKey,
      networkName,
      disconnect,
    };
  },
});
</script>

<style scoped>
.wallet-header {
  background-color: #111827;
  color: #ffffff;
  padding: 1rem;
}

.connect-btn, .disconnect-btn {
  background-color: #6366f1;
  padding: 0.5rem 1rem;
  border-radius: 8px;
  font-weight: bold;
  cursor: pointer;
}

.connect-btn:hover, .disconnect-btn:hover {
  background-color: #4f46e5;
}

.network {
  font-size: 0.9rem;
  opacity: 0.8;
}

.address {
  background: #1f2937;
  padding: 0.4rem 0.8rem;
  border-radius: 6px;
  font-family: monospace;
}
</style>
