package com.shoppinghp.dao;

import com.shoppinghp.entity.Account;
import com.shoppinghp.exception.ShoppingException;
import com.shoppinghp.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class AccountDAO implements IAccountDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public AccountDAO (){}

    @Override
    public List<Account> getAllAccounts() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            String hql = "FROM Account as a ORDER BY a.email";
            transaction = session.beginTransaction();
            Query<Account> query = session.createQuery(hql, Account.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public List<String> getRoles() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            String hql = "SELECT DISTINCT a.role FROM Account as a";
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
            List<String> result = query.list();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Account getAccount(String email) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            String hql = "FROM Account a WHERE a.email = :email";
            transaction = session.beginTransaction();
            Query<Account> query = session.createQuery(hql, Account.class);
            query.setParameter("email", email);
            return session.get(Account.class, email);
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Account getAccountLogin(String email) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("SELECT a.email, a.password, a.role,a.isActive " +
                    "FROM Account a " +
                    "Where a.email like :email");
            query.setParameter("email", email);
            List<Object[]> list = query.list();
            Account account = new Account();
            for (Object[] row : list) {
                account.setEmail(row[0].toString());
                account.setPassword(row[1].toString());
                account.setRole(row[2].toString());
                account.setIsActive((short) row[3]);
            }
            return account;
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void addAccount(Account account) {

    }

    @Override
    public Account updateAccount(Account account) throws ShoppingException {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Account a where email = :email");
            query.setParameter("email", account.getEmail());

            Account account_temp = (Account) query.list().get(0);
            account_temp.setPhone(account.getPhone());
            account_temp.setShipAddress(account.getShipAddress());
            account_temp.setBillingAddress(account.getBillingAddress());
            account_temp.setAddress(account.getAddress());
            account_temp.setRole(account.getRole());
            account_temp.setFullName(account.getFullName());
            //account_temp.setImage(account.getImage());
            session.update(account_temp);
            return account_temp;
        }catch (Exception e) {
            e.printStackTrace();
            logger.error(e.toString());
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public int updateAccountStatus(String email, short isActive) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            String hql = "UPDATE Account a SET a.isActive = :isActive WHERE email = :email";
            transaction = session.beginTransaction();

            Query query = session.createQuery(hql);
            query.setParameter("isActive", isActive);
            query.setParameter("email", email);
            int result = query.executeUpdate();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public boolean accountExists(String email, String password) {
        return false;
    }
}
