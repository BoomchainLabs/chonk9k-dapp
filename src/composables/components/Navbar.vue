<template>
  <nav class="navbar">
    <router-link to="/">CHONK9K</router-link>
    <button @click="$emit('open-wallet')">Connect Wallet</button>
  </nav>
</template>

<script setup lang="ts"></script>

<style scoped>
.navbar {
  display: flex;
  justify-content: space-between;
  padding: 1rem 2rem;
  background-color: #ffffff;
  border-bottom: 1px solid #e0e0e0;
}
</style>
