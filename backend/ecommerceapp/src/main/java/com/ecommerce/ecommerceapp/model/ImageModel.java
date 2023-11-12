package com.ecommerce.ecommerceapp.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "IMAGES")
public class ImageModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMAGE", unique = true, nullable = false)
    private Integer idImage;
    @Column(name = "URL", nullable = false, unique = true)
    private String url;
    @Column(name = "ALT_TEXT", nullable = false, length = 80)
    private String altText;

    @Column(name = "NAME", nullable = false, length = 800)
    private String name;

    public ImageModel(String url, String altText, Integer id, String name) {
        this.url = url;
        this.altText = altText;
        this.idImage = id;
        this.name = name;
    }

    protected ImageModel() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public Integer getIdImage() {
        return idImage;
    }

    public void setIdImage(Integer idImage) {
        this.idImage = idImage;
    }
}
