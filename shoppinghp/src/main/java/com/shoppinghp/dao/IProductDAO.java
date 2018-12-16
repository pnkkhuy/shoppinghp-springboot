package com.shoppinghp.dao;

import com.shoppinghp.entity.Product;
import com.shoppinghp.exception.ShoppingException;

import java.util.List;

public interface IProductDAO {
    List<Product> getAllProduct();
    Product getProductByProductID(int productId);
    Product updateProduct(Product product) throws ShoppingException;
    int updateProductStatus(int productId, short isActive) throws Exception;
    Product addProduct(Product product);
}
