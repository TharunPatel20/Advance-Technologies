package order.service.cqrs.query.service;

import order.service.cqrs.command.event.OrderCreatedEvent;
import order.service.cqrs.query.entity.OrderReadModel;
import order.service.cqrs.query.repository.OrderReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service

public class OrderQueryService {

    @Autowired
    private  OrderReadRepository orderReadRepository;

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {
        OrderReadModel orderReadModel = new OrderReadModel(
                event.getOrderId(),
                event.getProduct(),
                event.getQuantity(),
                event.getPrice()
        );
        orderReadRepository.save(orderReadModel);
    }
}