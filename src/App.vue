<script setup>

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

        <router-link to="/cart">
          <img width="50" class="img-fluid" src="/cart.png" alt="" />
          <span class="top-0 start-100 translate-middle badge rounded-pill bg-primary">
            9
          </span>
        </router-link>
      </div>
    </div>
  </nav>
  <router-view></router-view>
</template>
