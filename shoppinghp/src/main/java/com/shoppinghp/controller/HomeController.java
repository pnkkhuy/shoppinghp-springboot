package com.shoppinghp.controller;

import com.shoppinghp.service.ICategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ICategoryService categoryService;



    @RequestMapping("/")
    public String welcome() {
        return "shop/index";
    }

    @RequestMapping("/product")
    public String product(Model model) {
        model.addAttribute("category_list", categoryService.getAllCategory());
        return "shop/product";
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
