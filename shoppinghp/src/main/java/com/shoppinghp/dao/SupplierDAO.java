package com.shoppinghp.dao;

import com.shoppinghp.entity.Category;
import com.shoppinghp.entity.Supplier;
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
public class SupplierDAO implements ISupplierDAO {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<Supplier> getAllSupplier() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM Supplier as s ORDER BY s.supplierId";
            Query<Supplier> query = session.createQuery(hql, Supplier.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Supplier getSupplierBySupplierID(int supplierId) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Supplier s where supplierId = :supplierId");
            query.setParameter("supplierId", supplierId);
            return (Supplier) query.list().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Supplier updateSupplier(Supplier supplier) throws ShoppingException {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Supplier s where supplierId = :supplierId");
            query.setParameter("supplierId", supplier.getSupplierId());
            Supplier supplier_temp = (Supplier) query.list().get(0);
            supplier_temp.setAddress(supplier.getAddress());
            supplier_temp.setCompanyName(supplier.getCompanyName());
            supplier_temp.setContactName(supplier.getContactName());
            supplier_temp.setEmail(supplier.getEmail());
            supplier_temp.setFax(supplier.getFax());
            supplier_temp.setNote(supplier.getNote());
            supplier_temp.setPhone(supplier.getPhone());
            supplier_temp.setWebsite(supplier.getWebsite());
            session.update(supplier_temp);
            return supplier_temp;
        }catch (Exception ex) {
            ex.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw ex;
        }
    }

    @Override
    public int updateSupplierStatus(int supplierId, short isActive) throws Exception {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            String hql = "UPDATE Supplier s SET s.isActive = :isActive WHERE supplierId = :supplierId";
            Query query = session.createQuery(hql);
            query.setParameter("isActive", isActive);
            query.setParameter("supplierId", supplierId);
            int result = query.executeUpdate();
            return result;
        }catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Supplier addSupplier(Supplier supplier) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            supplier.setIsActive((short) 1);
            int id = (int) session.save(supplier);
            return getSupplierBySupplierID(id);
        } catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }
}
