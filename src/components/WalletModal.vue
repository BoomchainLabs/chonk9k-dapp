<template>
  <div v-if="show" class="modal-overlay" @click.self="close">
    <div class="modal text-center">
      <h2>Connect Your Wallet</h2>
      <p>Select a wallet provider to get started.</p>

      <div class="wallet-options mt-8">
        <button v-for="wallet in wallets" :key="wallet.name" @click="connect(wallet)">
          <img :src="wallet.icon" :alt="wallet.name" class="wallet-icon" />
          {{ wallet.name }}
        </button>
      </div>

      <p v-if="status" class="mt-4">{{ status }}</p>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'WalletModal',
  props: {
    show: {
      type: Boolean,
      required: true,
    },
  },
  data() {
    return {
      status: '',
      wallets: [
        { name: 'Phantom', icon: '/wallets/phantom.png' },
        { name: 'Backpack', icon: '/wallets/backpack.png' },
        { name: 'Solflare', icon: '/wallets/solflare.png' },
      ],
    };
  },
  methods: {
    close() {
      this.$emit('close');
    },
    connect(wallet: { name: string; icon: string }) {
      this.status = `Connecting to ${wallet.name}...`;

      // Placeholder: Inject your real wallet connection logic here
      setTimeout(() => {
        this.status = `Connected with ${wallet.name}!`;
        this.$emit('connected', wallet.name);
      }, 1500);
    },
  },
});
</script>

<style scoped>
.wallet-options {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}

.wallet-icon {
  height: 24px;
  width: 24px;
  margin-right: 0.5rem;
  vertical-align: middle;
}
button {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 0.5rem;
}
</style>
