package com.shoppinghp.dao;

import com.shoppinghp.entity.Category;
import com.shoppinghp.entity.Product;
import com.shoppinghp.entity.Supplier;
import com.shoppinghp.exception.ShoppingException;
import com.shoppinghp.globalvariables.GlobalVariables;
import com.shoppinghp.utils.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ProductDAO implements IProductDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ICategoryDAO categoryDAO;

    @Autowired
    ISupplierDAO supplierDAO;

    @Override
    public List<Product> getAllProduct() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            String hql = "FROM Product p ORDER BY p.productId";
            transaction = session.beginTransaction();
            Query<Product> query = session.createQuery(hql, Product.class);
            return  query.list();
        }catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Product[] getProducts(int page) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM Product p";
            Query<Product> query = session.createQuery(hql, Product.class);
            query.setFirstResult((page - 1) * GlobalVariables.ITEM_PER_PAGE)
                    .setMaxResults(GlobalVariables.ITEM_PER_PAGE);
            return query.getResultStream().toArray(Product[]::new);
        }catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public long getTotalPages() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery(
                    "select count(*) from Product p where p.isActive = 1");
            long count = (Long)query.uniqueResult();

            return (count + GlobalVariables.ITEM_PER_PAGE - 1)/GlobalVariables.ITEM_PER_PAGE;
        }catch (Exception e) {
            e.printStackTrace();
            if(transaction != null)
                transaction.rollback();
        }
        return 0;
    }

    @Override
    public Product getProductByProductID(int productId) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Product p where productId = :productId");
            query.setParameter("productId", productId);
            return (Product) query.list().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Product updateProduct(Product product) throws ShoppingException {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Product p where productId = :productId");
            query.setParameter("productId", product.getProductId());

            Product product_temp = (Product) query.list().get(0);
            product_temp.setProductName(product.getProductName());
            product_temp.setProductDescription(product.getProductDescription());

            Supplier supplier = supplierDAO.getSupplierBySupplierID(product.getSupplier().getSupplierId());
            product_temp.setSupplier(supplier);

            Category category = categoryDAO.getCategoryByCategoryID(product.getCategory().getCategoryId());
            product_temp.setCategory(category);

            product_temp.setQuantityPerUnit(product.getQuantityPerUnit());
            product_temp.setUnitPrice(product.getUnitPrice());
            product_temp.setAvailableColors(product.getAvailableColors());
            product_temp.setAvailableSize(product.getAvailableSize());
            product_temp.setSize(product.getSize());
            product_temp.setColor(product.getColor());
            product_temp.setDiscount(product.getDiscount());
            product_temp.setUnitWeight(product.getUnitWeight());
            product_temp.setUnitOnStock(product.getUnitOnStock());
            product_temp.setUnitOnOrder(product.getUnitOnOrder());

            session.update(product_temp);
            return product_temp;
        }catch (Exception ex) {
            ex.printStackTrace();
            if(transaction != null)
                transaction.rollback();
            throw ex;
        }
    }

    @Override
    public int updateProductStatus(int productId, short isActive) throws Exception {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            String hql = "UPDATE Product p SET p.isActive = :isActive WHERE productId = :productId";
            Query query = session.createQuery(hql);
            query.setParameter("isActive", isActive);
            query.setParameter("productId", productId);
            int result = query.executeUpdate();
            return result;
        } catch (Exception e){
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }

    @Override
    public Product addProduct(Product product) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
            transaction = session.beginTransaction();
            product.setIsActive((short) 1);
            int id = (int) session.save(product);
            return getProductByProductID(id);
        } catch (Exception e) {
            if(transaction != null)
                transaction.rollback();
            throw e;
        }
    }
}
