package com.example.demo.Controller;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.pojo.Resource;
import com.example.demo.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
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
        User u = new User();
        u.setName("yjiao47");
        u.setAge(25);
        u.setBirthday(new Date());
        u.setPassword("kevin@1994");
        // 使用html编写description，使用th:text不能进行转化
        // th:utext自动进行解释
        u.setDesc("<font color='green'><b>hello yjiao47</b></font>");
        map.addAttribute("user", u);
		
		User u1 = new User();
		u1.setAge(19);
		u1.setName("imooc");
		u1.setPassword("123456");
		u1.setBirthday(new Date());
		
		User u2 = new User();
		u2.setAge(17);
		u2.setName("LeeCX");
		u2.setPassword("123456");
		u2.setBirthday(new Date());
		
		List<User> userList = new ArrayList<>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		
		map.addAttribute("userList", userList);
        return "thymeleaf/test";
    }

    @PostMapping("postform")
    public String postform(User u) {
        System.out.println(u.getName());
        return "redirect:/th/test";
    }
}