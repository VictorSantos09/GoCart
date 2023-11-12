package com.ecommerce.ecommerceapp.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PRODUCTS", indexes = {@Index(name = "IDX_PRODUCTS_001", columnList = "ID_PRODUCT", unique = true)})
public class ProductModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUCT")
    private Integer idProduct;
    @Column(name = "NAME", unique = true, nullable = false, length = 80)
    private String name;
    @Column(name = "DESCRIPTION", nullable = false, unique = false, length = 600)
    private String description;
    @Column(name = "PRICE", nullable = false, unique = false)
    private Double price;

    @OneToOne(targetEntity = ImageModel.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_IMAGE", nullable = false)
    private ImageModel images;

    public ProductModel(String name, String description, Double price, Integer id, ImageModel images) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.idProduct = id;
        this.images = images;
    }

    protected ProductModel() {

    }

    public ImageModel getImages() {
        return images;
    }

    public void setImages(ImageModel images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }
}
