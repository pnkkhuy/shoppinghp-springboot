package com.shoppinghp.dao;

import com.shoppinghp.entity.Account;
import com.shoppinghp.exception.ShoppingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class AccountDAO implements IAccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public AccountDAO (){}

    @Override
    public List<Account> getAllAccounts() {
        String sql = "Select new " + Account.class.getName() + " from " + Account.class.getName();
        Session session = this.sessionFactory.getCurrentSession();
        Query<Account> query = session.createQuery(sql, Account.class);
        return query.getResultList();
    }

    @Override
    public Account getAccount(String email) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.get(Account.class, email);
    }

    @Override
    public Account getAccount(String email, String password) {
        String hql = "FROM Account A WHERE A.email = :email and A.password = :password";
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("email", email);
        query.setParameter("password", password);
        return (Account) query.list().get(0);
    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public void updateAccount(Account account) throws ShoppingException {

    }

    @Override
    public boolean accountExists(String email, String password) {
        return false;
    }
}
