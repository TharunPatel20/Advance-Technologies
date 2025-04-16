package com.example.rabbitmq_cqrs.producer.repository;


import com.example.rabbitmq_cqrs.producer.entity.CommandOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CommandOrder, Long> {
}