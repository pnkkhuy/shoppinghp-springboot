package com.shoppinghp.dao;

import com.shoppinghp.entity.Account;
import com.shoppinghp.entity.Category;
import com.shoppinghp.exception.ShoppingException;
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
public class CategoryDAO implements ICategoryDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<Category> getAllCategory() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM Category as c ORDER BY c.categoryId";
            Query<Category> query = session.createQuery(hql, Category.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Category getCategoryByCategoryID(int categoryId) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();

            Query query = session.createQuery("FROM Category c where categoryId = :categoryId");
            query.setParameter("categoryId", categoryId);
            return (Category) query.list().get(0);
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Category updateCategory(Category category) throws ShoppingException {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();

            Query query = session.createQuery("FROM Category c where categoryId = :categoryId");
            query.setParameter("categoryId", category.getCategoryId());
            Category category_temp = (Category) query.list().get(0);
            category_temp.setCategoryName(category.getCategoryName());
            category_temp.setDescription(category.getDescription());
            session.update(category_temp);
            return category_temp;
        }catch (Exception ex) {
            ex.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw ex;
        }
    }

    @Override
    public int updateCategoryStatus(int categoryId, short isActive) throws Exception {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            String hql = "UPDATE Category c SET c.isActive = :isActive WHERE categoryId = :categoryId";
            Query query = session.createQuery(hql);
            query.setParameter("isActive", isActive);
            query.setParameter("categoryId", categoryId);
            int result = query.executeUpdate();
            return result;
        }catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
            throw e;
        }

    }

    @Override
    public Category addCategory(Category category) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            category.setIsActive((short) 1);
            int id = (int) session.save(category);
            return getCategoryByCategoryID(id);
        }catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }
}
