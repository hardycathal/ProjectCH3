package ie.atu.projectch3.repo;

import ie.atu.projectch3.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {
}
