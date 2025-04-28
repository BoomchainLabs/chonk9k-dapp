import { ref } from 'vue';
import { useWalletAdapter } from '@solana/wallet-adapter-vue';

export function useWallet() {
  const { wallet, publicKey, connect, disconnect } = useWalletAdapter();
  
  const isConnected = ref(false);

  async function connectWallet() {
    try {
      await connect();
      isConnected.value = true;
    } catch (error) {
      console.error('Wallet connection error:', error);
    }
  }

  async function disconnectWallet() {
    await disconnect();
    isConnected.value = false;
  }

  return { wallet, publicKey, isConnected, connectWallet, disconnectWallet };
}
