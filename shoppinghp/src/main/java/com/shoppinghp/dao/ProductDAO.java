package com.shoppinghp.dao;

import com.shoppinghp.entity.Category;
import com.shoppinghp.entity.Product;
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
public class ProductDAO implements IProductDAO {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    ICategoryDAO categoryDAO;

    @Autowired
    ISupplierDAO supplierDAO;

    @Override
    public List<Product> getAllProduct() {
        try {
            String hql = "FROM Product p ORDER BY p.productId";
            Session session = this.sessionFactory.getCurrentSession();
            Query<Product> query = session.createQuery(hql, Product.class);
            return  query.list();
        }catch (Exception e) {
            e.printStackTrace();
            logger.error("getAllProduct", e);
        }
        return null;
    }

    @Override
    public Product[] getProducts(int page) {
        return new Product[0];
    }

    @Override
    public long getTotalPages() {
        try {
            Session session = this.sessionFactory.getCurrentSession();
            Query query = session.createQuery(
                    "select count(*) from Product p where p.isActive = 1");
            long count = (Long)query.uniqueResult();

            return (count / 10) + 1;
        }catch (Exception e) {
            e.printStackTrace();
            logger.error("getAllProduct", e);
        }
        return 0;
    }

    @Override
    public Product getProductByProductID(int productId) {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Product p where productId = :productId");
        query.setParameter("productId", productId);
        return (Product) query.list().get(0);
    }

    @Override
    public Product updateProduct(Product product) throws ShoppingException {
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Product p where productId = :productId");
        query.setParameter("productId", product.getProductId());
        try {
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
            logger.error(ex.toString());
            throw new ShoppingException(ex.toString());
        }
    }

    @Override
    public int updateProductStatus(int productId, short isActive) throws Exception {
        String hql = "UPDATE Product p SET p.isActive = :isActive WHERE productId = :productId";
        Session session = this.sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setParameter("isActive", isActive);
        query.setParameter("productId", productId);
        int result = query.executeUpdate();
        return result;
    }

    @Override
    public Product addProduct(Product product) {
        product.setIsActive((short) 1);
        Session session = this.sessionFactory.getCurrentSession();
        int id =  (int) session.save(product);
        return getProductByProductID(id);
    }
}
