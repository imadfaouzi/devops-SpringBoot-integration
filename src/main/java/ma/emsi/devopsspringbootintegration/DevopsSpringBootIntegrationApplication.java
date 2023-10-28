package ma.emsi.devopsspringbootintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsSpringBootIntegrationApplication {

    @GetMapping("/")
    public String helloPage(){
        return  "hello everyone !!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsSpringBootIntegrationApplication.class, args);
    }

}
