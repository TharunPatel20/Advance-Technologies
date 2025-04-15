package order.service.cqrs.command.controller;

import order.service.cqrs.command.entity.CommandOrder;
import order.service.cqrs.command.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
//@RequiredArgsConstructor
public class OrderCommandController {

    @Autowired
    private  OrderService orderService;

    @PostMapping
    public CommandOrder createOrder(@RequestBody CommandOrder order) {
        return orderService.createOrder(order);
    }
}