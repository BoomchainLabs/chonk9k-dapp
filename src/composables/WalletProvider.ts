// src/composables/WalletProvider.ts

import { ref } from 'vue';

interface WalletProvider {
  name: string;
  url: string;
  icon: string;
  adapter?: any;
}

export const connectedWallet = ref<string | null>(null);
export const publicKey = ref<string | null>(null);
export const connectionStatus = ref<'idle' | 'connecting' | 'connected' | 'error'>('idle');

/**
 * Supported wallets with default metadata
 */
export const walletProviders: WalletProvider[] = [
  { name: 'Phantom', url: 'https://phantom.app/', icon: '/wallets/phantom.png' },
  { name: 'Backpack', url: 'https://backpack.app/', icon: '/wallets/backpack.png' },
  { name: 'Solflare', url: 'https://solflare.com/', icon: '/wallets/solflare.png' },
];

/**
 * Connect to the selected wallet
 */
export async function connectWallet(walletName: string) {
  try {
    connectionStatus.value = 'connecting';

    // Handle Phantom
    if (walletName === 'Phantom' && (window as any).solana?.isPhantom) {
      const resp = await (window as any).solana.connect();
      connectedWallet.value = 'Phantom';
      publicKey.value = resp.publicKey.toString();
      connectionStatus.value = 'connected';
      return;
    }

    // Handle Backpack
    if (walletName === 'Backpack' && (window as any).backpack?.isBackpack) {
      const resp = await (window as any).backpack.connect();
      connectedWallet.value = 'Backpack';
      publicKey.value = resp.publicKey.toString();
      connectionStatus.value = 'connected';
      return;
    }

    // Handle Solflare
    if (walletName === 'Solflare' && (window as any).solflare?.isSolflare) {
      const resp = await (window as any).solflare.connect();
      connectedWallet.value = 'Solflare';
      publicKey.value = resp.publicKey.toString();
      connectionStatus.value = 'connected';
      return;
    }

    throw new Error('Wallet not found. Please install the extension.');
  } catch (error: any) {
    console.error(error);
    connectionStatus.value = 'error';
    connectedWallet.value = null;
    publicKey.value = null;
  }
}

/**
 * Disconnect wallet
 */
export async function disconnectWallet() {
  try {
    if ((window as any).solana?.isPhantom) await (window as any).solana.disconnect();
    if ((window as any).backpack?.isBackpack) await (window as any).backpack.disconnect();
    if ((window as any).solflare?.isSolflare) await (window as any).solflare.disconnect();
  } catch (e) {
    console.warn('Wallet may already be disconnected.');
  } finally {
    connectedWallet.value = null;
    publicKey.value = null;
    connectionStatus.value = 'idle';
  }
}
