package com.example.demo.Controller;

import com.example.demo.pojo.JsonResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("err")
public class ErrorController {
    @RequestMapping("/error")
    public String error() {
        int a = 1 / 0;
        return "templates/error";
    }

    @RequestMapping("/ajaxerror")
    public String ajaxerror() {
        return "templates/thymeleaf/ajaxerror";
    }

    @RequestMapping("/getAjaxerror")
    @ResponseBody
    public JsonResult getAjaxerror() {
        int a = 1 / 0;
        return JsonResult.ok();
    }
}