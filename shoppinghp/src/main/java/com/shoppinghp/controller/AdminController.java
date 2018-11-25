package com.shoppinghp.controller;

import com.shoppinghp.dao.AccountDAO;
import com.shoppinghp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public String adminHome() {
        return "admin/index";
    }

    //region Account
    @RequestMapping("/account")
    public String account(Model model) {
        model.addAttribute("account_list", accountService.getAllAccounts());
        return "admin/account";
    }

    @RequestMapping(value = "/account_active", method = RequestMethod.GET)
    public String account_active(Model model,
                                    @RequestParam("email") String email,
                                    @RequestParam("isActive")short isActive) {
        int result = accountService.updateAccountStatus(email, isActive);

        if(result == 0)
            model.addAttribute("updateerror", result);

        model.addAttribute("account_list", accountService.getAllAccounts());
        return "admin/account";
    }
    //endregion
}
