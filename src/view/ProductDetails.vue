<script setup>
import { ref, defineProps } from 'vue';
import ApiService from '../services/ApiService';

const props = defineProps({
    id: String
});

var product = ref({})

function getProductById() {
    ApiService.request("http://localhost:8080/product/id?id=" + props.id).then((data) => {
        product.value = data;
        console.log(data);
    })
}
getProductById()
</script>

<template>
    <section class="container">
        <div class="p-3 d-flex my-3 bg-light rounded-3">
            <img :src="product.images.url" style="width: 20em; height: fit-content" class="img-fluid rounded-3"
                :alt="product.images.altText" />

            <div class="mx-5">
                <h2 class="m-3">{{ product.nome }}</h2>
                <h4 class="m-3">R$ {{ product.price }}</h4>
                <h4 class="m-3">Descrição</h4>
                <p class="m-3">{{ product.description }}</p>
                <div class="d-flex justify-content-end">
                    <button class="btn btn-primary btn-lg m-3">Comprar</button>
                </div>
            </div>
        </div>
    </section>
</template>
