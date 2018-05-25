package group.zhouyang.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String hi(String name){

        return restTemplate.getForObject("http://SERVICE-CLIENT/client?name="+name,String.class);
    }
}
