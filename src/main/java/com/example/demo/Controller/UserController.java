package com.example.demo.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.pojo.User;
import com.example.demo.pojo.JsonResult;

// @RestController 等于 @Controller + @ResponseBody
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User u = new User();
        u.setName("yjiao47");
        u.setPassword("jiaoyi1994");
        u.setBirthday(new Date());
        u.setAge(18);
        return u;
    }

    @RequestMapping("/getUserJson")
    @ResponseBody
    public JsonResult getUserJson() {
        User u = new User();
        u.setName("yjiao47");
        u.setPassword("jiaoyi1994");
        u.setBirthday(new Date());
        u.setAge(18);
        return JsonResult.ok(u);
    }
}