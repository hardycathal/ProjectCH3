package ie.atu.projectch3.service;

import ie.atu.projectch3.dto.Menu;
import ie.atu.projectch3.entity.OrderItem;
import ie.atu.projectch3.feign.MenuClient;
import ie.atu.projectch3.repo.OrderItemRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {
    private final OrderItemRepo orderItemRepo;

    public OrderItemService(OrderItemRepo orderItemRepo) {
        this.orderItemRepo = orderItemRepo;
    }

    public List<OrderItem> getItemsByOrderId(Long orderId) {
        return orderItemRepo.findById(orderId);
    }
}
