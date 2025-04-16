package com.example.rabbitmq_cqrs.consumer.service;

import com.example.rabbitmq_cqrs.consumer.entity.OrderReadModel;
import com.example.rabbitmq_cqrs.consumer.repository.OrderReadRepository;
import com.example.rabbitmq_cqrs.producer.event.OrderCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service

public class OrderQueryService {

    @Autowired
    private OrderReadRepository orderReadRepository;

//    @EventListener
//    public void handleOrderCreated(OrderCreatedEvent event) {
//        OrderReadModel orderReadModel = new OrderReadModel(
//                event.getOrderId(),
//                event.getProduct(),
//                event.getQuantity(),
//                event.getPrice()
//        );
//        orderReadRepository.save(orderReadModel);
//    }
}