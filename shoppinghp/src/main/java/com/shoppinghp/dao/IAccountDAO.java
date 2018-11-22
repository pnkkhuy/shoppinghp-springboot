package com.shoppinghp.dao;

import com.shoppinghp.entity.Account;
import com.shoppinghp.exception.ShoppingException;

import java.util.List;

public interface IAccountDAO {
    List<Account> getAllAccounts();
    Account getAccount(String email);
    Account getAccount(String email, String password);
    void addAccount(Account account);
    void updateAccount(Account account) throws ShoppingException;
    boolean accountExists(String email, String password);
}
