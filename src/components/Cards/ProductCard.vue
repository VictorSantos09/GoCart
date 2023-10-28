<script setup>
import buttonDefault from '../buttons/ButtonDefault.vue'
import buttonError from '../buttons/ButtonError.vue'

defineProps({
    url: String,
    alt: String,
    title: String,
    productDescription: String,
    productName: String
})
</script>

<template>
    <div class="card" style="width: 18rem;">
        <img :src="url" class="card-img-top" :alt="alt">
        <div class="card-body">
            <h5 class="card-title">{{ title }}</h5>
            <p class="card-text">{{ productDescription }}</p>
        </div>
        <div class="d-flex">
            <buttonDefault class="m-2" msg="Comprar" />
            <buttonError class="m-2" msg="Cancelar" />
        </div>
    </div>
</template>

<style></style>