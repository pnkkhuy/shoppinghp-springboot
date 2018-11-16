package com.shoppinghp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "MyShop/index";
    }

    @RequestMapping("/admin")
    public String adminHome() {
        return "Admin/index";
    }

    @RequestMapping("/403")
    public String loginerror() {
        return "Admin/403";
    }

    @RequestMapping("/login")
    public String login() {
        return "Admin/signin";
    }
}
