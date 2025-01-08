package ie.atu.projectch3.repo;

import ie.atu.projectch3.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findById(Long id);
}
