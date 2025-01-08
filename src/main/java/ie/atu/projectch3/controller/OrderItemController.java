package ie.atu.projectch3.controller;

import ie.atu.projectch3.dto.Menu;
import ie.atu.projectch3.service.OrderItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/orderItem")
@RestController
public class OrderItemController {
    private final OrderItemService orderItemService;
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping("/items")
    public ResponseEntity<List<Menu>> showItems() {
        return new ResponseEntity<>(orderItemService.showItems(), HttpStatus.OK);
    }


}
