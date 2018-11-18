package com.shoppinghp.dao;

import com.shoppinghp.entitty.Account;
import com.shoppinghp.exception.ShoppingException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class AccountDAO implements IAccountDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Account> getAllAccounts() {
        String hql = "FROM Account as acc ORDER BY acc.email";
        return (List<Account>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Account getAccount(String email) {
        return entityManager.find(Account.class, email);
    }

    @Override
    public void addAccount(Account account) {
        entityManager.persist(account);
    }

    @Override
    public void updateAccount(Account account) throws ShoppingException {
        if(accountExists(account.getEmail(), account.getPassword())) {
            Account acc = new Account(account);

        } else {
            String message = String.format("Update account failed %s",account.getEmail());
            throw new ShoppingException(message);
        }
    }

    @Override
    public boolean accountExists(String email, String password) {
        return false;
    }
}