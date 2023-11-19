package com.ecommerce.ecommerceapp.services;

import com.ecommerce.ecommerceapp.dto.BaseDTO;
import com.ecommerce.ecommerceapp.dto.OrderDTO;
import com.ecommerce.ecommerceapp.model.OrderModel;
import com.ecommerce.ecommerceapp.repository.OrderRepository;
import com.ecommerce.ecommerceapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;

    public BaseDTO buy(OrderDTO dto) {
        if (dto.getAmount() <= 0) {
            return new BaseDTO("quantidade inválida", false);
        }

        var product = productRepository.findById(dto.getIdProduct());
        if (!product.isPresent()) {
            return new BaseDTO("produto não encontrado", false);
        }

        var order = new OrderModel(product.get(), dto.getAmount());
        orderRepository.save(order);

        return new BaseDTO("pedido finalizado", true);
    }
}
