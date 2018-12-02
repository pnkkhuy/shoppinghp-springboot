package com.shoppinghp.service;

import com.shoppinghp.entity.Account;
import com.shoppinghp.exception.ShoppingException;

import java.util.List;

public interface IAccountService {
    List<Account> getAllAccounts();
    Account getAccount(String email);
    boolean  addAccount(Account account);
    Account updateAccount(Account account) throws ShoppingException;
    int updateAccountStatus(String email, short isActive);
    boolean accountExists(String email, String password);
}
