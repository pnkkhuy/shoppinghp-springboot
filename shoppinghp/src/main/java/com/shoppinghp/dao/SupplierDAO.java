package com.shoppinghp.dao;

import com.shoppinghp.entity.Category;
import com.shoppinghp.entity.Supplier;
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
public class SupplierDAO implements ISupplierDAO {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Supplier> getAllSupplier() {
        String hql = "FROM Supplier as s ORDER BY s.supplierId";
        Session session = this.sessionFactory.getCurrentSession();
        Query<Supplier> query = session.createQuery(hql, Supplier.class);
        return query.getResultList();
    }

    @Override
    public Supplier getSupplierBySupplierID(int supplierId) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Supplier s where supplierId = :supplierId");
        query.setParameter("supplierId", supplierId);
        return (Supplier) query.list().get(0);
    }

    @Override
    public Supplier updateSupplier(Supplier supplier) throws ShoppingException {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Supplier s where supplierId = :supplierId");
        query.setParameter("supplierId", supplier.getSupplierId());
        try {
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
            logger.error(ex.toString());
            throw new ShoppingException(ex.toString());
        }
    }

    @Override
    public int updateSupplierStatus(int supplierId, short isActive) throws Exception {
        String hql = "UPDATE Supplier s SET s.isActive = :isActive WHERE supplierId = :supplierId";
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("isActive", isActive);
        query.setParameter("supplierId", supplierId);
        int result = query.executeUpdate();
        return result;
    }

    @Override
    public Supplier addSupplier(Supplier supplier) {
        supplier.setIsActive((short) 1);
        Session session = this.sessionFactory.getCurrentSession();
        int id =  (int) session.save(supplier);
        return getSupplierBySupplierID(id);
    }
}
