package com.example.rabbitmq_cqrs.producer.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "orders_cm")
public class CommandOrder {
    @Id
    @GeneratedValue
    private Long id;
    private String product;
    private Integer quantity;
    private Double price;

    //    @Version
//    private Integer version;
    public  CommandOrder(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}