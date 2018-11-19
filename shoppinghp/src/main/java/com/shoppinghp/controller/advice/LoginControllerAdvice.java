package com.shoppinghp.controller.advice;

import com.shoppinghp.entity.Account;
import com.shoppinghp.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class LoginControllerAdvice {

    private static Logger logger = LoggerFactory.getLogger(LoginControllerAdvice.class);

    @Autowired
    IAccountService accountService;

    @ModelAttribute
    public void addLoginToModel(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken) && authentication.isAuthenticated()) {
            String email = authentication.getName();
            try {
                Account account = accountService.getAccount(email);
                model.addAttribute("account_fullName", account.getFullName());
            } catch (Exception ex) {
                ex.printStackTrace();
                logger.error("addLoginToModel: " + ex.getMessage());
            }
        }
    }
}
