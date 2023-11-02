<script setup>
</script>

<template>
    <section class="container">
        <div class="w-25 my-5 border border-light border-5 radious-5">
            <div class="m-3">
                <h5>Valor Final</h5>
                <h5>Total de Produtos</h5>
                <h5>Endereço</h5>
                <h5>Forma de Pagamento</h5>
                <button class="btn btn-primary">Confirmar Compra</button>
            </div>
        </div>

        <div class="row">
            <div class="col-3 bg-light bg-gradient card border border-5 border-light">
                <img src="../../public/cart.png" class="card-img-top" alt="...">
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