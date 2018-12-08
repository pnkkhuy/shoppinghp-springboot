package com.shoppinghp.service;

import com.shoppinghp.dao.ICategoryDAO;
import com.shoppinghp.entity.Category;
import com.shoppinghp.exception.ShoppingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ICategoryDAO categoryDAO;

    @Override
    public List<Category> getAllCategory() {
        return categoryDAO.getAllCategory();
    }

    @Override
    public Category getCategoryByCategoryID(int categoryId) {
        if(categoryId == 0)
            return null;
        else
            return categoryDAO.getCategoryByCategoryID(categoryId);
    }

    @Override
    public Category updateCategory(Category category) throws ShoppingException {
        return categoryDAO.updateCategory(category);
    }

    @Override
    public int updateCategoryStatus(int categoryId, short isActive) throws Exception {
        try {
            if (categoryId == 0 || isActive < 0 || isActive > 1)
                return 0;

            int result = categoryDAO.updateCategoryStatus(categoryId, isActive);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("[updateAccountStatus] error", e);
            return 0;
        }
    }

    @Override
    public Category addCategory(Category category) throws ShoppingException {
        if(category.getCategoryName().isEmpty())
            throw new ShoppingException("Category Name cann't be empty");

        return categoryDAO.addCategory(category);
    }
}
