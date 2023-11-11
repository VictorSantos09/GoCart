<script setup>
import { ref } from "vue";
import ProductCard from "../components/Cards/ProductCard.vue";
import InputText from "../components/Inputs/InputText.vue";
import ButtonDefault from "../components/buttons/ButtonDefault.vue";
import FakeDatabase from "../FakeDatabase";


const products = ref(FakeDatabase.produtos);
</script>

<template>
    <div class="container">
        <!--Apresentação Produtos-->
        <div class="row mb-5">
            <InputText class="col" placeholder="Busque o produto" />
            <ButtonDefault class="col-lg-2  col mx-4 btn-lg" msg="Buscar" />
        </div>

        <div class="row">
            <div class="col-lg-3 col mb-3" v-for="product in products" :key="product.id">
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
