package com.example.rabbitmq_cqrs.producer.rabbitmq;

import com.example.rabbitmq_cqrs.producer.event.OrderCreatedEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderProducer {
    private final RabbitTemplate rabbitTemplate;

    public OrderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public void send(OrderCreatedEvent orderCreatedEvent) {
        System.out.println("orderCreatedEvent: "+ orderCreatedEvent);
        rabbitTemplate.convertAndSend("producer-consumer-cqrs", orderCreatedEvent);
    }
}