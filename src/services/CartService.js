export default class CartService {
  static products = this.getProductsFromLocalStorage();

  static getTotalProducts() {
    return this.products.length;
  }

  static getProductsFromLocalStorage() {
    const products = JSON.parse(localStorage.getItem("products"));
    return products ? products : [];
  }

  static saveProductsToLocalStorage(products) {
    localStorage.setItem("products", JSON.stringify(products));
    console.log("produto adicionado", this.products);
  }

  static addProductToCart(product) {
    this.products.push(product);
    this.saveProductsToLocalStorage(this.products);
  }

  static removeProductFromCart(productId) {
    const index = this.products.findIndex(
      (product) => product.id === productId
    );
    this.products.splice(index, 1);
    this.saveProductsToLocalStorage(this.products);
  }
}
