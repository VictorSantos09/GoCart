<script setup>
import Cart from '../services/CartService';
import { ref, computed } from 'vue';

const products = ref(Cart.getProductsFromLocalStorage());
const totalPrice = computed(() => {
    return products.value.reduce((total, product) => {
        return total + product.product.price;
    }, 0);


});
</script>

<template>
    <section class="container">
        <!--Finalizar Compra-->
        <div class="d-flex mb-5">
            <div class="p-3 bg-light">
                <h5>Finalizar Compra</h5>
                <hr>
                <h5 class="p-2">{{ products.length }} Produtos Selecionados</h5>
                <label for="enderecoEntrega" class="bg-primary text-white p-1 rounded-2">entregar em</label>
                <h5 id="enderecoEntrega" class="p-2">Rua Bolívia, 342. Ponta Aguda, Blumenau-SC</h5>
                <hr>
                <h5 class="p-2">Você Pagará R$ {{ totalPrice }}</h5>
                <button class="btn btn-primary my-2">Confirmar Compra</button>
            </div>
        </div>

        <div class="d-flex justify-content-between">
            <h5>Produtos no Carrinho</h5>
            <h5>{{ products.length }} Itens</h5>
        </div>
        <table class="table table-hover table-responsive">
            <thead>
                <tr>
                    <th scope="col">Detalhes do Produto</th>
                    <th scope="col">Quantidade</th>
                    <th scope="col">Preço</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="product in products" :key="product.idProduct">
                    <td>
                        <div class="d-flex">
                            <img :src="product.product.images.url" class="img-fluid w-25 h-50" :alt="product.product.images.altText">
                            <div class="container mt-3">
                                <p>{{ product.product.name }}</p>
                                
                                <!--Remover Produto-->
                                <button class="btn btn-outline-light align-self-bottom" style="color: gray;"
                                    @click="Cart.removeProductFromCart(product.product.idProduct)">Remover</button>
                            </div>
                        </div>

                    </td>
                    <td>
                        <div class="d-flex">
                            <button class="btn btn-light mx-2 fw-bolder fs-5" @click="() => {
                                product.amount++;
                                
                            }">+</button>
                            <input class="form-control quantity" type="number" :value="product.amount" name="" id="" disabled>
                            <button class="btn btn-light mx-2 fw-bolder fs-5" @click="() =>{
                                if(product.amount > 1){
                                    product.amount--;
                                }
                            }">-</button>
                        </div>
                    </td>
                    <td>R$ {{ product.product.price }}</td>
                </tr>
            </tbody>
        </table>
    </section>
</template>

<style scoped>
.quantity {
    width: 3em;
}
</style>