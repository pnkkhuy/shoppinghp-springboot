package com.shoppinghp.controller;

import com.shoppinghp.service.ICategoryService;
import com.shoppinghp.service.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IProductService productService;

    @RequestMapping("/")
    public String welcome() {
        return "shop/index";
    }

    @RequestMapping("/product")
    public String product(@RequestParam int page , Model model) {
        model.addAttribute("category_list", categoryService.getAllCategory());
        //model.addAttribute("product_list", productService.getAllProduct());
        model.addAttribute("totalpages", productService.getTotalPages());
        model.addAttribute("product_list", productService.getProducts(page));
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
