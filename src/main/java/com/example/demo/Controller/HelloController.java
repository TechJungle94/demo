package com.example.demo.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.JsonResult;
import com.example.demo.pojo.Resource;

@RestController
public class HelloController {
    @Autowired
    private Resource resource;

    
    @RequestMapping("/hello")
    public Object hello() {
        return "hello springboot~~~~~~~";
    }

    @RequestMapping("/getResource")
    public JsonResult getResource() {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return JsonResult.ok(bean);
    }
}