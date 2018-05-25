package group.zhouyang.springcloud.eureka.controller;

import group.zhouyang.springcloud.eureka.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeignController {
    @Autowired
    IFeignService iFeignService;

    @GetMapping("/cl")
    @ResponseBody
    public String hi(@RequestParam String name){
        return iFeignService.hi(name);
    }
}
