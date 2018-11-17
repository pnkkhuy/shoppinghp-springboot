package com.shoppinghp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/")
    public String adminHome() {
        return "admin/index";
    }

    @RequestMapping("/category")
    public String category() { return "admin/category"; }
}
