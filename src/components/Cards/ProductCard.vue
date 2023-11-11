<script setup>
import buttonDefault from "../buttons/ButtonDefault.vue";
import ProductModel from "../../Models/ProductModel";

const props = defineProps({
  product: ProductModel,
});
</script>

<template>
  <div class="card border border-solid border-light border-5">
    <router-link :to="'/product/' + product.id">
      <button class="btn">
        <img
          :src="product.imageUrl"
          class="card-img-top img-fluid rounded"
          :alt="product.alt"
        />
        <div class="card-body">
          <h3 class="card-title">{{ product.name }}</h3>
          <p class="card-text">{{ product.description }}</p>

          <h4 class="card-text d-flex">R$ {{ product.price }}</h4>
          <h6 class="card-text d-flex">Em até 12x</h6>
          <h6 class="card-text d-flex">Compre agora</h6>
        </div>
      </button>
    </router-link>

    <div class="d-flex justify-content-end p-2">
      <buttonDefault class="m-2 btn-lg" msg="Comprar" />
    </div>
  </div>
</template>

<style></style>
