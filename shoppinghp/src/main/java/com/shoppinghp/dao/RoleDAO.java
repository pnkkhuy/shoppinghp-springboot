package com.shoppinghp.dao;

import com.shoppinghp.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class RoleDAO implements IRoleDAO {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<String> getAllRole() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            String hql = "SELECT role FROM Role";
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
}
