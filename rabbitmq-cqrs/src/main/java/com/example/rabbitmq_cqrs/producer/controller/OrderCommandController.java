package com.example.rabbitmq_cqrs.producer.controller;

import com.example.rabbitmq_cqrs.producer.entity.CommandOrder;
import com.example.rabbitmq_cqrs.producer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
//@RequiredArgsConstructor
public class OrderCommandController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public CommandOrder createOrder(@RequestBody CommandOrder order) {
        return orderService.createOrder(order);
    }
}
