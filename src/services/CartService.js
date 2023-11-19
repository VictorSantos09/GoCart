import {ref} from 'vue'

export default class CartService {
  static products = this.getProductsFromLocalStorage();
  static total = ref(this.products.length);

  static getTotalProducts() {
    return this.products.length;
  }

  static getProductsFromLocalStorage() {
    const products = JSON.parse(localStorage.getItem("products"));
    return products ? products : [];
  }

  static saveProductsToLocalStorage(products) {
    localStorage.setItem("products", JSON.stringify(products));
  }

  static addProductToCart(product) {
    this.products.push(product);
    this.saveProductsToLocalStorage(this.products);
    this.updateTotal();
  }

  static removeProductFromCart(productId) {
    const index = this.products.findIndex(
      (product) => product.id === productId
    );
    this.products.splice(index, 1);
    this.saveProductsToLocalStorage(this.products);
    this.updateTotal();
  }

  static updateProduct(product){
    this.removeProductFromCart(product.id);
    this.addProductToCart(product);
    this.updateTotal();
  }

  static updateTotal(){
    this.total = this.getTotalProducts();
  }
}