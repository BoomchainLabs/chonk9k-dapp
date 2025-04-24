$CHONK9K DApp

A decentralized application (DApp) frontend for $CHONK9K, optimized with Vite, TypeScript, and Tailwind CSS. This project serves as the foundation for interacting with the $CHONK9K token on the Solana blockchain. Ready for Vercel deployment, it offers seamless wallet integrations, token transfers, and utilities for users to engage with $CHONK9K and Chonky Cosmos NFTs.

⸻

Features
	•	Vite-based frontend for fast builds and hot-reloading.
	•	Solana wallet integration (e.g., Phantom) for $CHONK9K token interactions.
	•	Tailwind CSS for a modern and responsive UI.
	•	TypeScript for type safety and enhanced development experience.
	•	Optimized for Vercel with automatic preview deployments.
	•	Customizable environment configurations for Solana and token functionalities.

⸻

Tech Stack
	•	Frontend Framework: Vite
	•	Blockchain: Solana
	•	Wallet Integration: Phantom, Sollet
	•	Styling: Tailwind CSS
	•	State Management: Zustand (optional, based on project needs)
	•	Deployment: Vercel
	•	Environment Management: .env files for environment-specific variables

⸻

Getting Started

Prerequisites

Before you begin, ensure you have the following installed:
	•	Node.js (v14 or higher)
	•	npm or Yarn (for package management)
	•	A Solana wallet (e.g., Phantom) for testing and integration.

 Installation
	1.	Clone the repository:
 git clone https://github.com/BoomchainLabs/chonk9k-dapp.git
cd chonk9k-dapp

	2.	Install dependencies:
 If using npm:
 npm install

 If using Yarn:
 yarn install

 	Set up environment variables:
Create a .env.local file in the root directory and configure the following:
VITE_SOLANA_RPC_URL=https://api.mainnet-beta.solana.com
VITE_PHANTOM_WALLET_URL=https://www.phantom.app/
VITE_CHONK9K_TOKEN_ADDRESS=DnUsQnwNot38V9JbisNC18VHZkae1eKK5N2Dgy55pump

Start the development server:
If using npm:
npm run dev

If using Yarn:
yarn dev

Usage

This DApp allows users to interact with $CHONK9K token functionalities on the Solana blockchain. Integrating with wallets like Phantom, users can send, receive, and check balances of $CHONK9K tokens. Future features may include Chonky Cosmos NFT interaction and additional token utilities.

Key Interactions:
	•	Wallet Connection: Connect your Solana wallet to interact with $CHONK9K.
	•	Token Transfers: Send or receive $CHONK9K tokens using the connected wallet.
	•	NFT Features: (Future implementation) Interact with Chonky Cosmos NFTs.

⸻

Contributing

Contributions are welcome! To get started, fork the repository, make your changes, and submit a pull request.

⸻

License

This project is licensed under the MIT License - see the LICENSE file for details.

⸻

Contact

For any questions or support, feel free to reach out to BoomchainLabs at support@boomchainlab.com.

Visit http://localhost:3000 in your browser to view the application
