import ProductModel from "./Models/ProductModel";

export default class FakeDatabase {
  static produtos = [
    new ProductModel(
      1,
      "Iphone 15",
      100,
      "Bom",
      "src/assets/products/Iphone15.jpg",
      "Imagem de um Iphone15"
    ),
    new ProductModel(
      2,
      "Iphone 15",
      10340,
      "Bom",
      "https://images.kabum.com.br/produtos/fotos/sync_mirakl/382677/Computador-Completo-Cpu-Intel-Core-I7-16GB-HD-1TB-Monitor-19-5-3green-Homeoffice_1661885330_gg.jpg",
      "Imagem de um Iphone15"
    ),
    new ProductModel(
      3,
      "Iphone 15",
      10560,
      "Bom",
      "https://images.tcdn.com.br/img/img_prod/833676/computador_completo_1200_home_i3_10100_ddr4_4gb_hd_500gb_mouse_teclado_monitor_18_5_3337_1_ab04a97594bbbb6e5e2887f4bf2d0471.jpg",
      "Imagem de um Iphone15"
    ),
    new ProductModel(
      4,
      "Iphone 15",
      2312,
      "Bom",
      "https://media.pichau.com.br/media/catalog/product/cache/2f958555330323e505eba7ce930bdf27/k/i/kit-pc-completo-kennedy-copiar-pulsar-001.jpg"
    ),
    new ProductModel(
      5,
      "Iphone 15",
      100,
      "Bom",
      "src/assets/products/Iphone15.jpg",
      "Imagem de um Iphone15"
    ),
    new ProductModel(
      6,
      "Iphone 15",
      100,
      "Bom",
      "src/assets/products/Iphone15.jpg",
      "Imagem de um Iphone15"
    ),
    new ProductModel(
      7,
      "Iphone 15",
      100,
      "Bom",
      "src/assets/products/Iphone15.jpg",
      "Imagem de um Iphone15"
    ),
    new ProductModel(
      8,
      "Iphone 15",
      100,
      "Bom",
      "src/assets/products/Iphone15.jpg",
      "Imagem de um Iphone15"
    ),
    new ProductModel(
      9,
      "Iphone 15",
      100,
      "Bom",
      "src/assets/products/Iphone15.jpg",
      "Imagem de um Iphone15"
    ),
    new ProductModel(
      10,
      "Iphone 15",
      100,
      "Bom",
      "src/assets/products/Iphone15.jpg",
      "Imagem de um Iphone15"
    ),
  ];

  static GetProductById(id) {
    return this.produtos.find((p) => p.id == id);
  }
}
