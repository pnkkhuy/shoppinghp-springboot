package com.shoppinghp.controller.admin;

import com.shoppinghp.entity.Product;
import com.shoppinghp.exception.ShoppingException;
import com.shoppinghp.service.ICategoryService;
import com.shoppinghp.service.IProductService;
import com.shoppinghp.service.ISupplierService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class ProductController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    IProductService productService;

    @Autowired
    ICategoryService categoryService;

    @Autowired
    ISupplierService supplierService;

    @RequestMapping("/product")
    public String productHome(Model model) {
        model.addAttribute("product_list", productService.getAllProduct());
        return "admin/product";
    }

    @RequestMapping(value = "/product_active", method = RequestMethod.GET)
    public String product_active(Model model,
                                  @RequestParam("productId") int productId,
                                  @RequestParam("isActive")short isActive) throws Exception {
        int result = productService.updateProductStatus(productId, isActive);

        if(result == 0)
            model.addAttribute("updateerror", true );

        model.addAttribute("product_list", productService.getAllProduct());
        return "admin/product";
    }

    @RequestMapping(value = "/product_update", method = RequestMethod.GET)
    public String product_update(Model model,
                                  @RequestParam("productId") int productId) throws ShoppingException {
        model.addAttribute("product", productService.getProductByProductID(productId));
        model.addAttribute("supplier_list", supplierService.getAllSupplier());
        return "admin/product_update";
    }

    @RequestMapping(value = "/product_update_proccess", method = RequestMethod.POST)
    public String product_update_proccess(Model model,
                                           @ModelAttribute Product product) throws ShoppingException {

        product = productService.updateProduct(product);

        model.addAttribute("product", product);
        return "admin/product_update";
    }

    @RequestMapping(value = "/product_add", method = RequestMethod.GET)
    public String product_add(Model model) throws ShoppingException {
        model.addAttribute("add_flag", true);
        model.addAttribute("product", new Product());
        return "admin/product_update";
    }

    @RequestMapping(value = "/product_add_proccess", method = RequestMethod.POST)
    public String product_add_proccess(Model model, @ModelAttribute Product product) throws ShoppingException {

        try {
            Product product_add = productService.addProduct(product);
            if(product_add != null) {
                model.addAttribute("product_list", productService.getAllProduct());
                return "admin/product";
            }
        }catch (ShoppingException ex) {
            model.addAttribute("updateerror", ex.getMessage());
        }
        model.addAttribute("add_flag", 1);
        model.addAttribute("product", new Product());
        return "redirect:/admin/product_add";
    }
}
