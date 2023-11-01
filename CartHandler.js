class Cart {
  static products = new Array();

  static AddProduct(product) {
    products.push(product);
    console.log(products);
  }

  static RemoveProduct(product) {
    let index = products.find((x) => x.id == product.id);
    products.splice(index, 1);
  }
}
