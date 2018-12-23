package com.shoppinghp.service;

import com.shoppinghp.dao.IAccountDAO;
import com.shoppinghp.entity.Account;
import com.shoppinghp.exception.ShoppingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IAccountDAO accountDAO;

    @Override
    public List<Account> getAllAccounts() {

        return accountDAO.getAllAccounts();
    }

    @Override
    public Account getAccount(String email) {
        if(email == null && email.isEmpty())
            return null;
        return accountDAO.getAccount(email);
    }

    @Override
    public List<String> getRoles() {
        return accountDAO.getRoles();
    }

    @Override
    public boolean addAccount(Account account) {
        return false;
    }

    @Override
    public Account updateAccount(Account account) throws ShoppingException {
        return  accountDAO.updateAccount(account);
    }

    @Override
    public int updateAccountStatus(String email, short isActive) {
        try {
            if (email == null || email.isEmpty() || isActive < 0 || isActive > 1)
                return 0;

            int result = accountDAO.updateAccountStatus(email, isActive);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("[updateAccountStatus] error", e);
            return 0;
        }
    }

    @Override
    public boolean accountExists(String email, String password) {
        return accountDAO.accountExists(email, password);
    }
}
