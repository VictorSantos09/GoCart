package com.ecommerce.ecommerceapp.controller;

import com.ecommerce.ecommerceapp.dto.BaseDTO;
import com.ecommerce.ecommerceapp.dto.OrderDTO;
import com.ecommerce.ecommerceapp.model.OrderModel;
import com.ecommerce.ecommerceapp.repository.OrderRepository;
import com.ecommerce.ecommerceapp.repository.ProductRepository;
import com.ecommerce.ecommerceapp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderService orderService;

    @PostMapping
    @CrossOrigin
    public BaseDTO buy(@RequestBody OrderDTO dto) {
        return orderService.buy(dto);
    }

    @GetMapping
    @CrossOrigin
    public List<OrderModel> get() {
        return orderRepository.findAll();
    }
}
