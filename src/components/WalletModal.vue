<template>
  <div class="modal-overlay" @click.self="$emit('close')">
    <div class="modal">
      <h2>Select Wallet</h2>
      <button @click="connectWallet">Connect Phantom</button>
    </div>
  </div>
</template>

<script setup lang="ts">
import { useWallet } from '@/composables/useWallet';
const { connectWallet } = useWallet();
</script>

<style scoped>
.modal-overlay {
  position: fixed;
  top: 0; left: 0;
  width: 100%; height: 100%;
  background-color: rgba(0,0,0,0.6);
  display: flex;
  align-items: center;
  justify-content: center;
}

.modal {
  background: white;
  padding: 2rem;
  border-radius: 12px;
  text-align: center;
}
</style>
