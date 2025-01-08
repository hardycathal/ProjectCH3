package ie.atu.projectch3.controller;

import ie.atu.projectch3.dto.Menu;
import ie.atu.projectch3.entity.OrderItem;
import ie.atu.projectch3.service.OrderItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/orderItem")
@RestController
public class OrderItemController {
    private final OrderItemService orderItemService;
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<OrderItem>> getItemsById(@PathVariable Long id) {
        List<OrderItem> items = orderItemService.getItemsByOrderId(id);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }



}
