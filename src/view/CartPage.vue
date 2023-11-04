<script setup>
</script>

<template>
    <section class="container">
        <div class="mb-3 bg-light rounded-3">
            <div class="p-3">
                <h5 class="p-2">10 Produtos Selecionados</h5>
                <h5 class="p-2">Rua Bolívia, 342. Ponta Aguda, Blumenau-SC</h5>
                <h5 class="p-2">Você Pagará R$ 1.543,34</h5>
                <button class="btn btn-primary my-2">Confirmar Compra</button>
            </div>
        </div>

        <h3>Itens no Carrinho</h3>
        <table class="table table-bordered table-hover table-striped table-responsive">
            <thead>
                <tr>
                    <th scope="col">Produto</th>
                    <th scope="col">Quantidade</th>
                    <th scope="col">Valor</th>
                </tr>
            </thead>
            <tbody class="table-group-divider">
                <tr>
                    <td>
                        <!--Nome do Produto-->
                        <p class="d-inline-flex">
                            <button class="btn btn-primary" type="button" data-bs-toggle="collapse"
                                data-bs-target="#cartDetailsProduct">
                                Banana Alabama Extension
                            </button>
                        </p>
                        <!--Detalhes do Produto-->
                        <div class="collapse" id="cartDetailsProduct">
                            <div class="card card-body">
                                Banana, pacoba ou pacova[1] é uma pseudobaga da bananeira, uma planta herbácea vivaz acaule
                                da família Musaceae (género Musa - além do género Ensete, que produz as chamadas "falsas
                                bananas"). São cultivadas em 130 países. Originárias do sudeste da Ásia são atualmente
                                cultivadas em praticamente todas as regiões tropicais do planeta.

                                <img src="../assets/products/banana.jpg" class="card-img-top w-75" alt="...">
                            </div>
                        </div>
                        <!--Remover Produto-->
                        <button class="btn btn-danger ms-2">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                class="bi bi-trash-fill" viewBox="0 0 16 16">
                                <path
                                    d="M2.5 1a1 1 0 0 0-1 1v1a1 1 0 0 0 1 1H3v9a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V4h.5a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1H10a1 1 0 0 0-1-1H7a1 1 0 0 0-1 1H2.5zm3 4a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 .5-.5zM8 5a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-1 0v-7A.5.5 0 0 1 8 5zm3 .5v7a.5.5 0 0 1-1 0v-7a.5.5 0 0 1 1 0z" />
                            </svg>
                        </button>
                    </td>
                    <td>1</td>
                    <td>R$ 45,50</td>
                </tr>
            </tbody>
        </table>
    </section>
</template>