package com.shoppinghp.service;

import com.shoppinghp.dao.IAccountDAO;
import com.shoppinghp.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;

    @Override
    public List<Account> getAllAccounts() {
        return accountDAO.getAllAccounts();
    }

    @Override
    public Account getAccount(String email) {
        return accountDAO.getAccount(email);
    }

    @Override
    public boolean addAccount(Account account) {
        return false;
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public boolean accountExists(String email, String password) {
        return accountDAO.accountExists(email, password);
    }
}
