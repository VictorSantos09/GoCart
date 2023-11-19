package com.ecommerce.ecommerceapp.repository;

import com.ecommerce.ecommerceapp.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Integer> {
}
