package ie.atu.projectch3.service;

import ie.atu.projectch3.dto.Menu;
import ie.atu.projectch3.feign.MenuClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {
    private final MenuClient menuClient;
    public OrderItemService(MenuClient menuClient) {
        this.menuClient = menuClient;
    }

    public List<Menu> showItems() {
        ResponseEntity<List<Menu>> response = menuClient.showItems();
        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            throw new RuntimeException("Failed to fetch menu items");
        }
    }
}
