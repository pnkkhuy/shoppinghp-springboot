package com.shoppinghp.service;

import com.shoppinghp.entity.Category;
import com.shoppinghp.exception.ShoppingException;

import java.util.List;

public interface ICategoryService {
    List<Category> getAllCategory();
    Category getCategoryByCategoryID(int categoryId);
    Category updateCategory(Category category) throws ShoppingException;
    int updateCategoryStatus(int categoryId, short isActive) throws Exception;
    Category addCategory(Category category) throws ShoppingException;
}
