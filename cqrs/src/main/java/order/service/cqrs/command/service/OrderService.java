package order.service.cqrs.command.service;



import order.service.cqrs.command.entity.CommandOrder;
import order.service.cqrs.command.event.OrderCreatedEvent;
import order.service.cqrs.command.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Service

public class OrderService {


    private  final OrderRepository orderRepository;
    private  final ApplicationEventPublisher eventPublisher;

    public OrderService(OrderRepository orderRepository, ApplicationEventPublisher eventPublisher) {
        this.orderRepository = orderRepository;
        this.eventPublisher = eventPublisher;
    }

//    @Transactional
            //(rollbackFor = MethodArgumentNotValidException.class)
    public CommandOrder createOrder(CommandOrder order) {
        CommandOrder savedOrder = orderRepository.save(order);
        eventPublisher.publishEvent(new OrderCreatedEvent(
                savedOrder.getId(),
                savedOrder.getProduct(),
                savedOrder.getQuantity(),
                savedOrder.getPrice()
        ));
        return savedOrder;
    }
}


