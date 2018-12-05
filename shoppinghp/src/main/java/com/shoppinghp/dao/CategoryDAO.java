package com.shoppinghp.dao;

import com.shoppinghp.entity.Account;
import com.shoppinghp.entity.Category;
import com.shoppinghp.exception.ShoppingException;
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
public class CategoryDAO implements ICategoryDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Category> getAllCategory() {
        String hql = "FROM Category as c ORDER BY c.categoryId";
        Session session = this.sessionFactory.getCurrentSession();
        Query<Category> query = session.createQuery(hql, Category.class);
        return query.getResultList();
    }

    @Override
    public Category getCategoryByCategoryID(int categoryId) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Category c where categoryId = :categoryId");
        query.setParameter("categoryId", categoryId);
        return (Category) query.list().get(0);
    }

    @Override
    public Category updateCategory(Category category) throws ShoppingException {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Category c where categoryId = :categoryId");
        query.setParameter("categoryId", category.getCategoryId());
        try {
            Category category_temp = (Category) query.list().get(0);
            category_temp.setCategoryName(category.getCategoryName());
            category_temp.setDescription(category.getDescription());
            session.update(category_temp);
            return category_temp;
        }catch (Exception ex) {
            ex.printStackTrace();
            logger.error(ex.toString());
            throw new ShoppingException(ex.toString());
        }
    }

    @Override
    public int updateCategoryStatus(int categoryId, short isActive) throws Exception {
        String hql = "UPDATE Category c SET c.isActive = :isActive WHERE categoryId = :categoryId";
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("isActive", isActive);
        query.setParameter("categoryId", categoryId);
        int result = query.executeUpdate();
        return result;

    }

    @Override
    public Category addCategory(Category category) {
        return null;
    }
}
