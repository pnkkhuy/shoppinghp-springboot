package com.shoppinghp.service;

import com.shoppinghp.dao.IProductDAO;
import com.shoppinghp.entity.Product;
import com.shoppinghp.exception.ShoppingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService  {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    IProductDAO productDAO;

    @Override
    public List<Product> getAllProduct() {
        return productDAO.getAllProduct();
    }

    @Override
    public Product[] getProducts(int page) {
        return productDAO.getProducts(page);
    }

    @Override
    public long getTotalPages() {
        return productDAO.getTotalPages();
    }

    @Override
    public Product getProductByProductID(int productId) {
        if(productId == 0)
            return null;
        else
            return productDAO.getProductByProductID(productId);
    }

    @Override
    public Product updateProduct(Product product) throws ShoppingException {
        return productDAO.updateProduct(product);
    }

    @Override
    public int updateProductStatus(int productId, short isActive) throws Exception {
        try {
            if (productId == 0 || isActive < 0 || isActive > 1)
                return 0;

            int result = productDAO.updateProductStatus(productId, isActive);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("[updateProductStatus] error", e);
            return 0;
        }
    }

    @Override
    public Product addProduct(Product product) throws ShoppingException {
        if(product.getProductName().isEmpty())
            throw new ShoppingException("Product Name cann't be empty");

        return productDAO.addProduct(product);
    }
}
