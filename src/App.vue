<script setup>
import ButtonDefault from './components/buttons/ButtonDefault.vue';
import ButtonError from './components/buttons/ButtonError.vue';

</script>

<template>
  <!--Navbar-->
  <nav class="navbar navbar-expand-lg navbar-light bg-light mb-5">
    <div class="container">
      <a class="navbar-brand" href="#">
        <div class="d-flex">
          <img src="/vite.svg" alt="" width="40" class="d-inline-block align-text-top" />
          <h3 class="mt-2">GoCart</h3>
        </div>
      </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto">
          <li class="nav-item mt-2">
            <router-link to="/">
              <h3 class="text-dark">Home</h3>
            </router-link>
          </li>
        </ul>

        <div class="d-flex">
          <button class="btn" data-bs-toggle="modal" data-bs-target="#visualizaoItensPedidos">
            <span class="top-0 start-100 translate-middle badge rounded-pill bg-primary">
              9
            </span>
            <img width="50" class="img-fluid" src="/cart.png" alt="" />
          </button>
        </div>
      </div>
    </div>
  </nav>

  <!--Itens Pedidos Modal-->
  <div class="modal fade" id="visualizaoItensPedidos">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h3 class="modal-title">Produtos no Carrinho</h3>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body" v-for="product in products" :key="product.id">
          <ProductCard />
        </div>
        <div class="modal-footer">
          <div class="d-flex">
            <ButtonError class="btn btn-danger mx-2" data-bs-dismiss="modal" aria-label="Close" msg="Voltar" />
            <ButtonDefault msg="Confirmar" />
          </div>
        </div>
      </div>
    </div>
  </div>
  <router-view></router-view>
</template>
