<script setup>
import { ref } from "vue";
import ApiService from "../services/ApiService";
const orders = ref([]);

function GetOrders() {
    return ApiService.request("http://localhost:8080/order").then((data) => {
        orders.value = data;
    })
}

GetOrders();
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
                <tr v-for="order in orders" :key="order.id">
                    <td>
                        <div class="d-md-flex">
                            <router-link :to="'/product/' + order.product.idProduct">
                                <img :src="order.product.images.url" :alt="order.product.images.altText"
                                    class="img-size rounded-2">
                            </router-link>
                            <p class="px-3">{{ order.product.name }}</p>
                        </div>
                    </td>
                    <td>{{ order.amount }}</td>
                    <td>R$ {{ order.product.price }}</td>
                    <td>{{ order.product.price * order.amount }}</td>
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