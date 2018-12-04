package com.shoppinghp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<String> getAllRole() {
        String hql = "SELECT role FROM Role";
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        List<String> result = query.list();
        return result;
    }
}
