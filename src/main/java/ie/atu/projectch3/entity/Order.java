package ie.atu.projectch3.entity;

import ie.atu.projectch3.dto.Customer;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private String customerName;
    private String customerEmail;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items;

    private Double totalPrice;

    public Order() {
    }

    public Order(Long id, Double totalPrice, List<OrderItem> items, String customerEmail, String customerName, Long customerId) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.items = items;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}

