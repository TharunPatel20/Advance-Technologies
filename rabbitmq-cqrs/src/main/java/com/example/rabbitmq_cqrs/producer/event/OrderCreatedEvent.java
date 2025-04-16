package com.example.rabbitmq_cqrs.producer.event;

public class OrderCreatedEvent {
    private Long orderId;
    private String product;
    private Integer quantity;
    private Double price;

    public Long getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public OrderCreatedEvent(Long orderId, String product, Integer quantity, Double price) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
}
