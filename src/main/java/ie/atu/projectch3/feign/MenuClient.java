package ie.atu.projectch3.feign;

import ie.atu.projectch3.dto.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="menu-client", url="http://localhost:8081/menu")
public interface MenuClient {

    @GetMapping("/showItems")
    public ResponseEntity<List<Menu>> showItems();
}
