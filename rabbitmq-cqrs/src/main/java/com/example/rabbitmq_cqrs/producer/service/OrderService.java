package com.example.rabbitmq_cqrs.producer.service;


import com.example.rabbitmq_cqrs.producer.entity.CommandOrder;
import com.example.rabbitmq_cqrs.producer.event.OrderCreatedEvent;
import com.example.rabbitmq_cqrs.producer.rabbitmq.OrderProducer;
import com.example.rabbitmq_cqrs.producer.repository.OrderRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;


@Service

public class OrderService {


    @Autowired
     OrderRepository orderRepository;
//   @Autowired
//   ApplicationEventPublisher eventPublisher;
    @Autowired
    RabbitTemplate rabbitTemplate;;




    //    @Transactional
    //(rollbackFor = MethodArgumentNotValidException.class)
    public CommandOrder createOrder(CommandOrder order) {
        CommandOrder savedOrder = orderRepository.save(order);
//        eventPublisher.publishEvent(new OrderCreatedEvent(
//                savedOrder.getId(),
//                savedOrder.getProduct(),
//                savedOrder.getQuantity(),
//                savedOrder.getPrice()
//        ));

//        now do using rabbbitMq
        OrderCreatedEvent event = new OrderCreatedEvent(
                savedOrder.getId(),
                savedOrder.getProduct(),
                savedOrder.getQuantity(),
                savedOrder.getPrice()
        );

        rabbitTemplate.convertAndSend("producer-consumer-cqrs",event);

        return savedOrder;
    }
}

