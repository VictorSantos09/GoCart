package com.ecommerce.ecommerceapp.controller;

import com.ecommerce.ecommerceapp.model.ProductModel;
import com.ecommerce.ecommerceapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @CrossOrigin
    public List<ProductModel> FindAll() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Optional<ProductModel> FindById(@RequestParam Integer id) {
        return productRepository.findById(id);
    }
}