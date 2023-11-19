package com.ecommerce.ecommerceapp.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ORDERS", indexes = {@Index(name = "IDX_ORDERS_001", columnList = "ID_ORDER", unique = true)})
public class OrderModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDER", unique = true, nullable = false)
    private Integer id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PRODUCT", nullable = false, unique = false)
    private ProductModel product;

    @Column(name = "AMOUNT", nullable = false, unique = false)
    private Integer amount;

    public OrderModel(ProductModel product, Integer amount) {
        this.product = product;
        this.amount = amount;
    }

    protected OrderModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
