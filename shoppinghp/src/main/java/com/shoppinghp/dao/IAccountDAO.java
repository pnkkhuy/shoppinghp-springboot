package com.shoppinghp.dao;

import com.shoppinghp.entity.Account;
import com.shoppinghp.exception.ShoppingException;

import java.util.List;

public interface IAccountDAO {
    List<Account> getAllAccounts();
    List<String> getRoles();
    Account getAccountLogin(String email);
    Account getAccount(String email);
    void addAccount(Account account);
    Account updateAccount(Account account) throws ShoppingException;
    int updateAccountStatus(String email, short isActive) throws Exception;
    boolean accountExists(String email, String password);
}
