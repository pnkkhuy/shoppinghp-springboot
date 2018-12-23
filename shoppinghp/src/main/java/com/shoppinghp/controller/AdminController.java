package com.shoppinghp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shoppinghp.dao.AccountDAO;
import com.shoppinghp.entity.Account;
import com.shoppinghp.entity.Category;
import com.shoppinghp.entity.Supplier;
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

    @Autowired
    private ISupplierService supplierService;

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

    // region Category

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String category(Model model) {
        model.addAttribute("category_list", categoryService.getAllCategory());
        return "admin/category";
    }

    @RequestMapping(value = "/category_active", method = RequestMethod.GET)
    public String category_active(Model model,
                                  @RequestParam("categoryId") int categoryId,
                                  @RequestParam("isActive")short isActive) throws Exception {
        int result = categoryService.updateCategoryStatus(categoryId, isActive);

        if(result == 0)
            model.addAttribute("updateerror", true );

        model.addAttribute("category_list", categoryService.getAllCategory());
        return "admin/category";
    }

    @RequestMapping(value = "/category_update", method = RequestMethod.GET)
    public String category_update(Model model,
                                   @RequestParam("categoryId") int categoryId) throws ShoppingException {
        model.addAttribute("category", categoryService.getCategoryByCategoryID(categoryId));
        return "admin/category_update";
    }

    @RequestMapping(value = "/category_update_proccess", method = RequestMethod.POST)
    public String category_update_proccess(Model model,
                                           @ModelAttribute Category category) throws ShoppingException {

        category = categoryService.updateCategory(category);

        model.addAttribute("category", category);
        return "admin/category_update";
    }

    @RequestMapping(value = "/category_add", method = RequestMethod.GET)
    public String category_add(Model model) throws ShoppingException {
        model.addAttribute("add_flag", true);
        model.addAttribute("category", new Category());
        return "admin/category_update";
    }

    @RequestMapping(value = "/category_add_proccess", method = RequestMethod.POST)
    public String category_add_proccess(Model model, @ModelAttribute Category category) throws ShoppingException {

        try {
            Category category_add = categoryService.addCategory(category);
            if(category_add != null) {
                model.addAttribute("category_list", categoryService.getAllCategory());
                return "admin/category";
            }
        }catch (ShoppingException ex) {
            model.addAttribute("updateerror", ex.getMessage());
        }
        model.addAttribute("add_flag", 1);
        model.addAttribute("category", new Category());
        return "redirect:/admin/category_add";
    }
    // endregion Category

    // region Supplier
    @RequestMapping(value = "/supplier", method = RequestMethod.GET)
    public String supplier(Model model) {
        model.addAttribute("supplier_list", supplierService.getAllSupplier());
        return "admin/supplier";
    }

    @RequestMapping(value = "/supplier_active", method = RequestMethod.GET)
    public String supplier_active(Model model,
                                  @RequestParam("supplierId") int supplierId,
                                  @RequestParam("isActive")short isActive) throws Exception {
        int result = supplierService.updateSupplierStatus(supplierId, isActive);

        if(result == 0)
            model.addAttribute("updateerror", true );

        model.addAttribute("supplier_list", supplierService.getAllSupplier());
        return "admin/supplier";
    }

    @RequestMapping(value = "/supplier_update", method = RequestMethod.GET)
    public String supplier_update(Model model,
                                  @RequestParam("supplierId") int supplierId) throws ShoppingException {
        model.addAttribute("supplier", supplierService.getSupplierBySupplierID(supplierId));
        return "admin/supplier_update";
    }

    @RequestMapping(value = "/supplier_update_proccess", method = RequestMethod.POST)
    public String supplier_update_proccess(Model model,
                                           @ModelAttribute Supplier supplier) throws ShoppingException {
        supplier = supplierService.updateSupplier(supplier);

        model.addAttribute("supplier", supplier);
        return "admin/supplier_update";
    }

    @RequestMapping(value = "/supplier_add", method = RequestMethod.GET)
    public String supplier_add(Model model) throws ShoppingException {
        model.addAttribute("add_flag", true);
        model.addAttribute("supplier", new Supplier());
        return "admin/supplier_update";
    }

    @RequestMapping(value = "/supplier_add_proccess", method = RequestMethod.POST)
    public String supplier_add_proccess(Model model, @ModelAttribute Supplier supplier) throws ShoppingException {

        try {
            Supplier supplier_add = supplierService.addSupplier(supplier);

            if(supplier_add != null) {
                model.addAttribute("category_list", categoryService.getAllCategory());
                return "admin/supplier";
            }
        }catch (ShoppingException ex) {
            model.addAttribute("updateerror", ex.getMessage());
        }
        return "redirect:/admin/supplier_add";
    }

    // endregion Supplier


}
