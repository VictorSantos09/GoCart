<script setup>
import { ref } from "vue";
import ProductCard from "../components/Cards/ProductCard.vue";
import InputText from "../components/Inputs/InputText.vue";
import ButtonDefault from "../components/buttons/ButtonDefault.vue";

const products = ref([
    {
        id: 1,
        name: "Produto 1",
        description: "Descrição do produto 1",
        price: 10,
    },
    {
        id: 2,
        name: "Produto 2",
        description: "Descrição do produto 2",
        price: 20,
    },
    {
        id: 3,
        name: "Produto 3",
        description: "Descrição do produto 3",
        price: 30,
    },
    {
        id: 4,
        name: "Produto 4",
        description: "Descrição do produto 4",
        price: 40,
    },
    {
        id: 5,
        name: "Produto 5",
        description: "Descrição do produto 5",
        price: 50,
    },
    {
        id: 6,
        name: "Produto 6",
        description: "Descrição do produto 6",
        price: 60,
    },
    {
        id: 7,
        name: "Produto 7",
        description: "Descrição do produto 7",
        price: 70,
    },
    {
        id: 8,
        name: "Produto 8",
        description: "Descrição do produto 8",
        price: 80,
    },
    {
        id: 9,
        name: "Produto 9",
        description: "Descrição do produto 9",
        price: 90,
    },
    {
        id: 10,
        name: "Produto 10",
        description: "Descrição do produto 10",
        price: 100,
    }
]);
</script>

<template>
    <div class="container">
        <div class="row mb-5">
            <InputText class="col" placeholder="Digite o produto que deseja buscar" />
            <ButtonDefault class="col-2 mx-4 btn-lg" msg="Buscar" />
        </div>

        <div class="row">
            <div class="col-3 mb-3" v-for="product in products" :key="product.id">
                <ProductCard :productPrice="product.price" :productName="product.name"
                    :productDescription="product.description" alt="Imagem de um iphone15"
                    url="src/assets/products/Iphone15.jpg" />
            </div>
        </div>
    </div>
</template>

<style></style>
