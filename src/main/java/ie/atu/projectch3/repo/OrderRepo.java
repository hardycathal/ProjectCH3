package ie.atu.projectch3.repo;

import ie.atu.projectch3.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
