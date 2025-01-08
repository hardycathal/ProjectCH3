package ie.atu.projectch3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectCh3Application {

    public static void main(String[] args) {
        SpringApplication.run(ProjectCh3Application.class, args);
    }

}
