<script setup>
import buttonDefault from "../buttons/ButtonDefault.vue";
import Cart from "../../services/CartService";
import ProductModel from "../../models/ProductModel";
import OrderModel from "../../models/OrderModel";

const props = defineProps({
  product: ProductModel,
});

function addToCart() {
  const order = new OrderModel(props.product, 1);
  Cart.addProductToCart(order);
}

</script>

<template>
  <div class="card border border-solid border-light border-5">
    <router-link :to="'/product/' + product.idProduct">
      <button class="btn">
        <img :src="product.images.url" class="card-img-top img-thumbnail img-fluid rounded"
          :alt="product.images.altText" />
        <div class="card-body">
          <h5 class="card-title">{{ product.name }}</h5>

          <h4 class="card-text d-flex">R$ {{ product.price }}</h4>
          <h6 class="card-text d-flex">Em até 12x</h6>
          <h6 class="card-text d-flex">Compre agora</h6>
        </div>
      </button>
    </router-link>

    <div class="d-flex justify-content-end p-2">
      <button class="m-2 btn btn-primary" @click="addToCart()">Adicionar ao Carrinho</button>
    </div>
  </div>
</template>

<style scoped></style>
