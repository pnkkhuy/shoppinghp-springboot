package com.shoppinghp.dao;

import com.shoppinghp.entity.Account;
import com.shoppinghp.exception.ShoppingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
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
        String hql = "FROM Account as a ORDER BY a.email";
        Session session = this.sessionFactory.getCurrentSession();
        Query<Account> query = session.createQuery(hql, Account.class);
        return query.getResultList();
    }

    @Override
    public Account getAccount(String email) {
        String hql = "SELECT a.email, a.role, a.fullName, a.address, a.phone, a.billingAddress, a.shipAddress, a.dateEntered, a.image, a.isActive " +
                    "FROM Account a WHERE a.email = :email";
        Session session = this.sessionFactory.getCurrentSession();
        Query<Account> query = session.createQuery(hql, Account.class);
        query.setParameter("email", email);
        return session.get(Account.class, email);
    }

    @Override
    public Account getAccountLogin(String email) {
        String sql = "SELECT a.Email, a.Password, a.Role ,a.IsActive, a.FullName, a.Address \n" +
                "FROM accounts a \n" +
                "Where a.Email like :email";
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createSQLQuery(sql);
        ((NativeQuery) query).addEntity(Account.class);
        query.setParameter("email", email);
        return (Account)query.getResultList().get(0);
    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public void updateAccount(Account account) throws ShoppingException {

    }

    @Override
    public int updateAccountStatus(String email, short isActive) throws Exception {
        String hql = "UPDATE Account a SET a.isActive = :isActive WHERE email = :email";
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("isActive", isActive);
        query.setParameter("email", email);
        int result = query.executeUpdate();
        return result;
    }

    @Override
    public boolean accountExists(String email, String password) {
        return false;
    }
}
