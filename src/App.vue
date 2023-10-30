<script setup></script>

<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light mb-5">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">
        <div class="d-flex">
          <img src="../../../public/vite.svg" alt="" width="40" class="d-inline-block align-text-top" />
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
          <button class="btn">
            <span class="top-0 start-100 translate-middle badge rounded-pill bg-primary">
              9
            </span>
            <img width="50" class="img-fluid" src="../../../public/cart.png" alt="" />
          </button>
        </div>
      </div>
    </div>
  </nav>
  <router-view></router-view>
</template>
