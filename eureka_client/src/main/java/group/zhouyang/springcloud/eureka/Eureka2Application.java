package group.zhouyang.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Eureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka2Application.class, args);
    }
    @GetMapping("/client")
    public String hello(@RequestParam String name){
        return "this is my name:"+name;
    }
}
