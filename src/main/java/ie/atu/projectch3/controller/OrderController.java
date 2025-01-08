package ie.atu.projectch3.controller;

import ie.atu.projectch3.entity.Order;
import ie.atu.projectch3.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }



}
