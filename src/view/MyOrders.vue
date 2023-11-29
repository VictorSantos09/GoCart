<script setup>
import { ref } from "vue";
import ApiService from "../services/ApiService";
import TableProduct from "../components/products/TableProduct.vue";
const orders = ref([]);

function GetOrders() {
    return ApiService.request("http://localhost:8080/order").then((data) => {
        orders.value = data;
    })
}

GetOrders();
</script>

<template>
   <TableProduct :orders="orders"/>
</template>