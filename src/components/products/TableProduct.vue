<script setup>
var props = defineProps(['orders'])
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
                        <div class="d-flex">
                            <router-link :to="'/product/' + order.product.idProduct">
                                <img :src="order.product.images.url" :alt="order.product.images.altText"
                                    class="img-fluid img-size d-none d-md-block d-lg-block d-xl-block">
                            </router-link>
                            <p class="px-3">{{ order.product.name }}</p>
                        </div>
                    </td>
                    <td>{{ order.amount }}</td>
                    <td>R$ {{ order.product.price }}</td>
                    <td>R$ {{ (order.product.price * order.amount).toFixed(2) }}</td>
                </tr>
            </tbody>
        </table>
    </div>
</template>


<style scoped>
.img-size {
    width: 10vh;
}
</style>