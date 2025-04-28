import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '@/views/HomeView.vue';
import DashboardView from '@/views/DashboardView.vue';

const routes = [
  { path: '/', name: 'Home', component: HomeView },
  { path: '/dashboard', name: 'Dashboard', component: DashboardView },
];

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
});

export default router;
