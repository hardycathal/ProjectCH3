package ie.atu.projectch3.controller;

import ie.atu.projectch3.entity.Order;
import ie.atu.projectch3.entity.OrderItem;
import ie.atu.projectch3.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create/{customerId}")
    public ResponseEntity<Order> createOrder(@PathVariable Long customerId, @RequestBody List<OrderItem> orderItems) {
        Order order = orderService.createOrder(customerId, orderItems);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Order>> getOrdersByCustomerId(@PathVariable Long customerId) {
        List<Order> orders = orderService.getOrdersByCustomerId(customerId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteOrderById(@PathVariable Long id) {
        orderService.deleteOrderById(id);
        return new ResponseEntity<>("Order deleted successfully", HttpStatus.OK);
    }


}
