<script setup>
import { ref } from "vue";
import ProductCard from "../components/Cards/ProductCard.vue";
import InputText from "../components/Inputs/InputText.vue";
import ButtonDefault from "../components/buttons/ButtonDefault.vue";
import ProductModel from "../Models/ProductModel.js";


const products = ref([
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
    new ProductModel(1,"Iphone 15", 100,"Bom", "src/assets/products/Iphone15.jpg", "Imagem de um Iphone15"),
]);
</script>

<template>
    <div class="container">
        <!--Apresentação Produtos-->
        <div class="row mb-5">
            <InputText class="col" placeholder="Digite o produto que deseja buscar" />
            <ButtonDefault class="col-2 mx-4 btn-lg" msg="Buscar" />
        </div>

        <div class="row">
            <div class="col-3 mb-3" v-for="product in products" :key="product.id">
                <ProductCard :product="product"/>
            </div>
        </div>

        <!--Paginação-->
        <nav class="d-flex justify-content-center">
            <ul class="pagination">
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li class="page-item active">
                    <a class="page-link" href="#">1</a>
                </li>
                <li class="page-item">
                    <a class="page-link" href="#">2</a>
                </li>
                <li class="page-item">
                    <a class="page-link" href="#">3</a>
                </li>
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>
</template>

<style></style>
