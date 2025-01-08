package ie.atu.projectch3.entity;

import ie.atu.projectch3.dto.Menu;
import jakarta.persistence.*;


@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long menuId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrderItem() {
    }

    public OrderItem(Long id, Integer quantity, Double price, String name, Long menuId) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.menuId = menuId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}


