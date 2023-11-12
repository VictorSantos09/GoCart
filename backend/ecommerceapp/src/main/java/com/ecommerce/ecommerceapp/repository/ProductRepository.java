package com.ecommerce.ecommerceapp.repository;

import com.ecommerce.ecommerceapp.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
}
