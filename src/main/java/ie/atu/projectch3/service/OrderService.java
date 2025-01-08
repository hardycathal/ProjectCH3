package ie.atu.projectch3.service;

import ie.atu.projectch3.dto.Customer;
import ie.atu.projectch3.dto.Menu;
import ie.atu.projectch3.entity.Order;
import ie.atu.projectch3.entity.OrderItem;
import ie.atu.projectch3.feign.CustomerClient;
import ie.atu.projectch3.feign.MenuClient;
import ie.atu.projectch3.repo.OrderRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepo orderRepo;
    private final MenuClient menuClient;
    private final CustomerClient customerClient;
    public OrderService(OrderRepo orderRepo, MenuClient menuClient, CustomerClient customerClient) {
        this.orderRepo = orderRepo;
        this.menuClient = menuClient;
        this.customerClient = customerClient;
    }

    public Order createOrder(@PathVariable Long id, List<OrderItem> orderItems) {
        Customer customer = customerClient.getCustomerById(id).getBody();

        double totalPrice = 0.0;

        for (OrderItem item : orderItems) {
            Menu menu = menuClient.getItemById(id).getBody();
            item.setName(menu.getName());
            item.setPrice(menu.getPrice() * item.getQuantity());
            totalPrice += item.getPrice();
        }

        Order order = new Order();
        order.setCustomerId(customer.getId());
        order.setCustomerName(customer.getFirstName() + " " + customer.getLastName());
        order.setCustomerEmail(customer.getEmail());
        order.setCustomerPhone(customer.getNumber());
        order.setTotalPrice(totalPrice);
        order.setItems(orderItems);
        return orderRepo.save(order);

    }

    public List<Order> getOrdersByCustomerId(Long customerId) {
        return orderRepo.findByCustomerId(customerId);
    }


}
