<script setup>
import { ref } from "vue";
import ApiService from "../services/ApiService";
const orders = ref([]);

function GetProducts() {
    return ApiService.request("http://localhost:8080/order").then((data) => {
        orders.value = data;
    })
}

GetProducts();

console.log(orders.value[0]);
</script>

<template>
    <div class="container">
        <table class="table table-hover table-light table-striped table-responsive">
            <thead>
                <tr>
                    <th scope="col">Item</th>
                    <th scope="col">Quantidade</th>
                    <th scope="col">Preço</th>
                    <th scope="col">Total</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="order in orders" :key="order.idProduct">
                    <td>
                        <div class="d-md-flex">
                            <router-link :to="'/product/' + order.products[0].idProduct">
                                {{ order.products.name }}
                                <img :src="order.products[0].images.url" :alt="order.products[0].images.altText"
                                    class="img-size rounded-2">
                            </router-link>
                            <p class="px-3">{{ order.products[0].name }}</p>
                        </div>
                    </td>
                    <td>{{ order.amount }}</td>
                    <td>R$ {{ order.products[0].price }}</td>
                    <td>{{ order.products[0].price * order.amount }}</td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<style scoped>
.img-size {
    width: 15vh;
}
</style>