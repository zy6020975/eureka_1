package group.zhouyang.springcloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String HystrixStr(String name){
        return restTemplate.getForObject("http://SERVICE-CLIENT/client?name="+name,String.class);
    }

    public String error(){
        return "系统错误";
    }
}
