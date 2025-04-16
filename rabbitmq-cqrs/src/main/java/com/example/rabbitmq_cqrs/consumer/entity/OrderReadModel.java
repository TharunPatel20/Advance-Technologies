package com.example.rabbitmq_cqrs.consumer.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "orders_read")
public class OrderReadModel implements Serializable {

    @Id
    private Long id;
    private String product;
    private Integer quantity;
    private Double price;

    public OrderReadModel(){}


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderReadModel(Long id, String product, Integer quantity, Double price) {
        this.id =id;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
}
