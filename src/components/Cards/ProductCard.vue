<script setup>
import buttonDefault from "../buttons/ButtonDefault.vue";

defineProps({
  url: String,
  alt: String,
  productDescription: String,
  productName: String,
  productPrice: Number,
});
</script>

<template>
  <div class="card border border-solid border-light border-5" style="width: 18rem">
    <button class="btn" data-bs-toggle="modal" data-bs-target="#exampleModal">
      <img :src="url" class="card-img-top" :alt="alt" />
      <div class="card-body">
        <h3 class="card-title">{{ productName }}</h3>
        <p class="card-text">{{ productDescription }}</p>

        <span class="d-flex">
          <h4 class="card-text">R$ {{ productPrice }}</h4>
        </span>
        <span class="d-flex">
          <h6 class="card-text">Em até 12x</h6>
        </span>
        <span class="d-flex">
          <h6 class="card-text">Compre agora</h6>
        </span>
      </div>
    </button>

    <div class="d-flex justify-content-end p-2">
      <buttonDefault class="m-2 btn-lg" msg="Comprar" />
    </div>
  </div>

  <!-- Modal -->
  <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">{{ productName }}</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body">
          <h4 class="d-flex">Imagens do Produto</h4>
          <!--Carrousel-->
          <div id="carouselExampleIndicators" class="carousel slide py-3" data-bs-ride="carousel">
            <div class="carousel-indicators">
              <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"
                aria-current="true" aria-label="Slide 1"></button>
              <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
                aria-label="Slide 2"></button>
              <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
                aria-label="Slide 3"></button>
            </div>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img :src="url" width="300" :alt="alt">
              </div>
              <div class="carousel-item">
                <img :src="url" width="300" :alt="alt">
              </div>
              <div class="carousel-item">
                <img :src="url" width="300" :alt="alt">
              </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
              data-bs-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
              data-bs-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="visually-hidden">Next</span>
            </button>
          </div>
          <!--Product Description-->
          <h5 class="d-flex">{{ productDescription }}</h5>
          <h5 class="d-flex">R$ {{ productPrice }}</h5>

          <div class="input-group flex-nowrap">
            <span class="input-group-text" id="qtdProduto">Quantidade</span>
            <input type="number" class="form-control" placeholder="Digite quantas unidades deseja">
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Voltar</button>
          <button type="button" class="btn btn-primary">Adicionar ao Carrinho</button>
        </div>
      </div>
    </div>
  </div>
</template>

<style></style>
