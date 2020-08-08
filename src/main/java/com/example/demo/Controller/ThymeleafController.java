package com.example.demo.Controller;

import java.security.PublicKey;

import com.example.demo.pojo.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("th")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "yjiao47");
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center() {
        return "thymeleaf/center/center";
    }

    @RequestMapping("/test")
    public String test(ModelMap map) {
        map.addAttribute("name", "Kevin");
        return "thymeleaf/index";
    }
}