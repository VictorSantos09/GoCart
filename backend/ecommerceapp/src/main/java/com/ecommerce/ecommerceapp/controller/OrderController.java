package com.ecommerce.ecommerceapp.controller;

import com.ecommerce.ecommerceapp.dto.BaseDTO;
import com.ecommerce.ecommerceapp.dto.OrderDTO;
import com.ecommerce.ecommerceapp.model.OrderModel;
import com.ecommerce.ecommerceapp.repository.OrderRepository;
import com.ecommerce.ecommerceapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    @CrossOrigin
    public BaseDTO buy(@RequestBody OrderDTO dto) {
        var product = productRepository.findById(dto.getIdProduct());
        if (!product.isPresent()) {
            return new BaseDTO("produto não encontrado", false);
        }

        var order = new OrderModel(product.get(), dto.getAmount());
        orderRepository.save(order);

        return new BaseDTO("pedido finalizado", true);
    }
}
