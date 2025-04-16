package com.example.rabbitmq_cqrs.consumer.rabbitmq;


import com.example.rabbitmq_cqrs.consumer.entity.OrderReadModel;
import com.example.rabbitmq_cqrs.consumer.repository.OrderReadRepository;
import com.example.rabbitmq_cqrs.producer.event.OrderCreatedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
    @Autowired
    OrderReadRepository orderReadRepository;

    @RabbitListener(queues = "producer-consumer-cqrs")
    public void consume(OrderCreatedEvent event) {
        System.out.println("Received Order: " + event);
        OrderReadModel orderReadModel = new OrderReadModel(
                event.getOrderId(),
                event.getProduct(),
                event.getQuantity(),
                event.getPrice()
        );

        orderReadRepository.save(orderReadModel);
    }
}
