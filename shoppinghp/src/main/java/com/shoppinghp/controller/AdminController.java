package com.shoppinghp.controller;

import com.shoppinghp.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AccountDAO accountDAO;

    @RequestMapping("/")
    public String adminHome() {
        return "admin/index";
    }

    @RequestMapping("/account")
    public String account(Model model)
    {
        model.addAttribute("account_list", accountDAO.getAllAccounts());
        return "admin/account";
    }
}
