package com.shoppinghp.dao;

import com.shoppinghp.entity.Category;

import java.util.List;

public interface ICategoryDAO {
    List<Category> getAllCategory();
    Category updateCategory(Category category);
    int updateCategoryStatus(int categoryId, short isActive) throws Exception;
    Category addCategory(Category category);
}
