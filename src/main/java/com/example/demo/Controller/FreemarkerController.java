package com.example.demo.Controller;

import com.example.demo.pojo.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ftl")
public class FreemarkerController {
    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map) {
        // ModelMap注入了一个对象，resource，并且在加载页面中命名为"resource"
        map.addAttribute("resource", resource);
        // 返回加载页面的路径
        return "freemarker/index";
    }

    @RequestMapping("/center")
    public String center() {
        // 返回加载页面的路径
        return "freemarker/test/center";
    }
}