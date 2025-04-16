package com.example.rabbitmq_cqrs.consumer.repository;


import com.example.rabbitmq_cqrs.consumer.entity.OrderReadModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReadRepository extends JpaRepository<OrderReadModel, Long> {
}