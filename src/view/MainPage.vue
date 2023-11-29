<script setup>
import { ref, computed } from "vue";
import ProductCard from "../components/Cards/ProductCard.vue";
import ApiService from "../services/ApiService";

const products = ref([]);

function GetProducts() {
    return ApiService.request("http://localhost:8080/product").then((data) => {
        products.value = data;
    })
}

const filter = ref('');
const filteredProducts = computed(() => {
    if (filter.value === '') {
        return products.value;
    } else {
        return products.value.filter((product) => {
            return product.name.toLowerCase().includes(filter.value.toLowerCase());
        });
    }
});

GetProducts();
</script>

<template>
    <div class="container">
        <!--Apresentação Produtos-->
        <div class="row mb-5">
            <input class="col form-control" placeholder="Busque o produto" type="text" v-model="filter">
        </div>
        <div class="row">
            <div class="col-lg-3 col mb-3" v-for="product in filteredProducts" :key="product.idProduct">
                <ProductCard :product="product" />
            </div>
        </div>
    </div>
</template>

<style></style>
