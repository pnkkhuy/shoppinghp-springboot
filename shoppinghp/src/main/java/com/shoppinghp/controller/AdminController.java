package com.shoppinghp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shoppinghp.dao.AccountDAO;
import com.shoppinghp.entity.Account;
import com.shoppinghp.entity.Category;
import com.shoppinghp.exception.ShoppingException;
import com.shoppinghp.service.*;
import com.shoppinghp.utils.JsonClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IAccountService accountService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private ICategoryService categoryService;

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
            model.addAttribute("updateerror", true );

        model.addAttribute("account_list", accountService.getAllAccounts());
        return "admin/account";
    }

    @RequestMapping(value = "/account_update", method = RequestMethod.GET)
    public String account_update(Model model,
                                 @RequestParam("email") String email) throws JsonProcessingException {

        model.addAttribute("roles", roleService.getAllRole());
        model.addAttribute("account", accountService.getAccount(email));
        return "admin/account_update";
    }

    @RequestMapping(value = "/account_update_proccess", method = RequestMethod.POST)
    public String account_update_proccess(Model model, @ModelAttribute Account account) throws ShoppingException {
        model.addAttribute("roles", roleService.getAllRole());
        model.addAttribute("account", accountService.updateAccount(account));

        return "admin/account_update";
    }
    //endregion

    // Category

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String category(Model model) {
        model.addAttribute("category_list", categoryService.getAllCategory());
        return "admin/category";
    }

    @RequestMapping(value = "category_active", method = RequestMethod.GET)
    public String category_active(Model model,
                                  @RequestParam("categoryId") int categoryId,
                                  @RequestParam("isActive")short isActive) throws Exception {
        int result = categoryService.updateCategoryStatus(categoryId, isActive);

        if(result == 0)
            model.addAttribute("updateerror", true );

        model.addAttribute("category_list", categoryService.getAllCategory());
        return "admin/category";
    }

    @RequestMapping(value = "category_update", method = RequestMethod.GET)
    public String category_update(Model model,
                                   @RequestParam("categoryId") int categoryId) throws ShoppingException {
        model.addAttribute("category", categoryService.getCategoryByCategoryID(categoryId));
        return "admin/category_update";
    }

    @RequestMapping(value = "category_update_proccess", method = RequestMethod.POST)
    public String category_update_proccess(Model model,
                                           @ModelAttribute Category category) throws ShoppingException {

        category = categoryService.updateCategory(category);

        model.addAttribute("category", category);
        return "admin/category_update";
    }
    // end Category
}
