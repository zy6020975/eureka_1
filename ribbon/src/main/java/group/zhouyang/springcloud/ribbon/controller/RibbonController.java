package group.zhouyang.springcloud.ribbon.controller;

import group.zhouyang.springcloud.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping("/cl")
    @ResponseBody
    public String hi(@RequestParam String name){
        return ribbonService.hi(name);
    }
}
