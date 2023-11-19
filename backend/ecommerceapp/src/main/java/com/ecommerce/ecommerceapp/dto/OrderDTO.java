package com.ecommerce.ecommerceapp.dto;

public class OrderDTO {
    private final Integer idProduct;
    private final Integer amount;

    public OrderDTO(Integer idProduct, Integer amount) {
        this.idProduct = idProduct;
        this.amount = amount;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public Integer getAmount() {
        return amount;
    }
}
