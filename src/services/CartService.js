export default class CartService {
  static products = this.getProductsFromLocalStorage();

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
  }

  static removeProductFromCart(productId) {
    const index = this.products.findIndex(
      (product) => product.id === productId
    );
    this.products.splice(index, 1);
    this.saveProductsToLocalStorage(this.products);  }

  static updateProduct(product) {
    this.removeProductFromCart(product.id);
    this.addProductToCart(product);
  }
}