package com.example.rabbitmq_cqrs.consumer.controller;

import com.example.rabbitmq_cqrs.consumer.entity.OrderReadModel;
import com.example.rabbitmq_cqrs.consumer.repository.OrderReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")

public class OrderQueryController {

    @Autowired
    private OrderReadRepository orderReadRepository;

    @GetMapping
    public List<OrderReadModel> getAllOrders() {
        return orderReadRepository.findAll();
    }

    @GetMapping("/{id}")
    public OrderReadModel getOrderById(@PathVariable Long id) {
        return orderReadRepository.findById(id).orElseThrow();
    }
}
