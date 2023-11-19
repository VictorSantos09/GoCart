<script setup>
import Cart from '../services/CartService';
import BuyProductService from '../services/BuyProductService';
import { ref } from 'vue';

const products = ref(Cart.getProductsFromLocalStorage());
const totalPrice = ref(0);
const confirmed = ref(false);

function calculateTotalPrice() {
    totalPrice.value = 0;
    products.value.forEach(element => {
        totalPrice.value += element.product.price * element.amount;
    });
}

function decrementAmount(product) {
    if (product.amount > 1) {
        product.amount--;
        updateTotalPrice(product);
    }
}

function incrementAmount(product) {
    product.amount++;
    updateTotalPrice(product);
}

function updateTotalPrice(product) {
    calculateTotalPrice();
    Cart.updateProduct(product);
}

function buy() {
    console.log('entrada buy');
    for (let index = 0; index < products.value.length; index++) {
        console.log('entrada for');
        const product = products.value[index];
        const resultBought = BuyProductService.buy(product.product.idProduct, product.amount);
        if (resultBought) {
            Cart.removeProductFromCart(product.product.idProduct);
            calculateTotalPrice();
            confirmed.value = true;
        }
    }
}

calculateTotalPrice();
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
                <h5 class="p-2">Você Pagará R$ {{ totalPrice.toFixed(2) }}</h5>
                <button class="btn btn-primary my-2" @click="() => buy()">Confirmar Compra</button>

                <!--alerta-->
                <div class="alert alert-success alert-dismissible fade show" v-if="confirmed" role="alert">
                    <strong>Obrigado por comprar conosco</strong>, sua encomenda está a caminho!
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
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
                            <img :src="product.product.images.url" class="img-fluid w-25 h-50"
                                :alt="product.product.images.altText">
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
                            <button class="btn btn-light mx-2 fw-bolder fs-5"
                                @click="() => incrementAmount(product)">+</button>
                            <input class="form-control w-25" type="number" :value="product.amount" name="" id="" disabled>
                            <button class="btn btn-light mx-2 fw-bolder fs-5"
                                @click="() => decrementAmount(product)">-</button>
                        </div>
                    </td>
                    <td>R$ {{ product.product.price.toFixed(2) }}</td>
                </tr>
            </tbody>
        </table>
    </section>
</template>

<style scoped></style>