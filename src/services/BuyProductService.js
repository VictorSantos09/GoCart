export default class BuyProductService {
  static buy(idProduct, amount) {
    const url = "http://localhost:8080/order";
    const data = {
      idProduct: idProduct,
      amount: amount,
    };

    return fetch(url, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    })
      .then((response) => response.json())
      .then((data) => {
        return data;
      })
      .catch((error) => {
        console.error(error);
      });
  }
}
