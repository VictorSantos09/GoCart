<script setup>
import ProductModel from "../Models/ProductModel.js";

defineProps({
    url: String,
    alt: String,
    product: ProductModel
});
</script>

<template>
    <section class="container">
        <div class="p-3 d-flex my-3 bg-light rounded-3">
            <img src="../assets/products/Bananas_(Alabama_Extension).jpg" style="width: 20em; height: fit-content;"
                class="img-fluid rounded-3" :alt="product.alt">

            <div class="mx-5">
                <h2 class="m-3">Banana Alabama Extension</h2>
                <h4 class="m-3">R$ 25,45</h4>
                <h4 class="m-3">Descrição</h4>
                <p class="m-3">Lorem ipsum dolor sit amet consectetur adipisicing elit. Culpa ea quidem animi corporis, quo
                    voluptates
                    architecto nesciunt temporibus cum inventore enim minus velit, consectetur quos? Nam accusantium dolor
                    ducimus mollitia adipisci excepturi architecto cum culpa et illo libero dolore aut incidunt, itaque quis
                    ab. Veniam magnam quia aperiam voluptatum ullam.</p>
                <div class="d-flex justify-content-end">
                    <button class="btn btn-primary btn-lg m-3">Comprar</button>
                </div>
            </div>
        </div>
    </section>
</template>