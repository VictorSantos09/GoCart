<script setup>
import FakeDatabase from '../FakeDatabase';
import { ref, defineProps } from 'vue';

const props = defineProps({
    id: String
});

var product = ref(FakeDatabase.GetProductById(props.id))
</script>

<template>
    <section class="container">
        <div class="p-3 d-flex my-3 bg-light rounded-3">
            <img :src="product.imageUrl" style="width: 20em; height: fit-content" class="img-fluid rounded-3"
                :alt="product.imageAlt" />

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
