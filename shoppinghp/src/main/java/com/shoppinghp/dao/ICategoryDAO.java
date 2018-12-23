package com.shoppinghp.dao;

import com.shoppinghp.entity.Category;
import com.shoppinghp.exception.ShoppingException;

import java.util.List;

public interface ICategoryDAO {
    List<Category> getAllCategory();
    Category getCategoryByCategoryID(int categoryId);
    Category updateCategory(Category category) throws ShoppingException;
    int updateCategoryStatus(int categoryId, short isActive) throws Exception;
    Category addCategory(Category category);
}
