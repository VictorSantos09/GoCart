<script setup>
</script>

<template>
    <section class="container">
        <div class="m-3 bg-light rounded-3">
            <div class="p-3">
                <h5 class="p-2">10 Produtos Selecionados</h5>
                <h5 class="p-2">Rua Bolívia, 342. Ponta Aguda, Blumenau-SC</h5>
                <h5 class="p-2">Você Pagará R$ 1.543,34</h5>
                <button class="btn btn-primary my-2">Confirmar Compra</button>
            </div>
        </div>

        <div class="row">
            <div class="col-3 card p-3">
                <img src="../../public/cart.png" class="card-img-top w-50" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Nome Produto</h5>
                    <p class="card-text">Descrição Produto</p>
                    <p class="card-text">Valor Unitário</p>

                    <div class="d-flex align-items-baseline">
                        <p class="card-text">Quantidade</p>
                        <!--Botões Incrementar e Decrementar Quantidade-->
                        <button class="btn btn-sm btn-outline-primary mx-1">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                class="bi bi-plus" viewBox="0 0 16 16">
                                <path
                                    d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
                            </svg>
                        </button>
                        <button class="btn btn-sm btn-outline-primary mx-1">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
                                class="bi bi-dash" viewBox="0 0 16 16">
                                <path d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z" />
                            </svg>
                        </button>
                    </div>
                    <p class="card-text">Valor Total</p>
                </div>
            </div>

        </div>
    </section>
</template>