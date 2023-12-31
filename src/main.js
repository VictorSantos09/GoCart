import { createApp } from "vue";
import "./style.css";
import App from "./App.vue";

import { createRouter, createWebHistory } from "vue-router";
import MainPage from "./view/MainPage.vue";
import ComponentsPresentantion from "./view/ComponentsPresentantion.vue";
import CartPage from "./view/CartPage.vue";
import ProductDetails from "./view/ProductDetails.vue";
import MyOrders from "./view/MyOrders.vue";

const routes = [
  { path: "/", component: MainPage },
  { path: "/components", component: ComponentsPresentantion },
  { path: "/cart", component: CartPage },
  {
    path: "/product/:id",
    component: ProductDetails,
    props: true,
  },
  { path: "/myorders", component: MyOrders },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

createApp(App).use(router).mount("#app");
