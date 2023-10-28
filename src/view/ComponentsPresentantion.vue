<script setup>
import buttonDefault from '../components/buttons/ButtonDefault.vue'
import buttonError from '../components//buttons/ButtonError.vue'
import buttonWarning from '../components/buttons/ButtonWarning.vue'
import inputText from '../components/Inputs/InputText.vue'
import inputNumber from '../components/Inputs/InputNumber.vue'
import productCard from '../components/Cards/ProductCard.vue'
import h1Default from '../components/texts/h1Default.vue'
import h2Default from '../components/texts/h2Default.vue'
import h3Default from '../components/texts/h3Default.vue'
import paragrafDefault from '../components/texts/ParagrafDefault.vue';
</script>

<template>
    <buttonDefault msg="Padrão" />
    <buttonError msg="Erro" />
    <buttonWarning msg="Aviso" />

    <inputText placeholder="vueJS is noice or not" />
    <inputNumber placeholder="select a number to rate vueJS" />

    <productCard
        url="https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Bananas_%28Alabama_Extension%29.jpg/280px-Bananas_%28Alabama_Extension%29.jpg"
        alt="a imagem de uma banana" title="A historia da banana"
        product-description="Banana, pacoba ou pacova[1] é uma pseudobaga da bananeira, uma planta herbácea vivaz acaule da família Musaceae"
        product-name="Banana" />

    <h1Default msg="i'm a H1" />
    <h2Default msg="i'm a H2" />
    <h3Default msg="i'm a H3" />

    <paragrafDefault msg="and i'm a p" />
</template>

<style scoped>

</style>