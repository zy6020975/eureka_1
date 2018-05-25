package group.zhouyang.springcloud.eureka.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client")
@Service
public interface IFeignService {

    @GetMapping("/client")
    String hi(@RequestParam("name") String name);
}
