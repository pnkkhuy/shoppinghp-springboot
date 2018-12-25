package com.shoppinghp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "shop/index";
    }

    @RequestMapping("/403")
    public String loginerror() {
        return "admin/403";
    }

    @RequestMapping("/login")
    public String login() {
        return "admin/signin";
    }
}
