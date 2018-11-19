package com.shoppinghp.service;

import com.shoppinghp.entity.Account;

import java.util.List;

public interface IAccountService {
    List<Account> getAllAccounts();
    Account getAccount(String email);
    boolean  addAccount(Account account);
    void updateAccount(Account account);
    boolean accountExists(String email, String password);
}
