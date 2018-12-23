package com.shoppinghp.service;

import com.shoppinghp.dao.ISupplierDAO;
import com.shoppinghp.entity.Category;
import com.shoppinghp.entity.Supplier;
import com.shoppinghp.exception.ShoppingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ISupplierDAO supplierDAO;

    @Override
    public List<Supplier> getAllSupplier() {
        return supplierDAO.getAllSupplier();
    }

    @Override
    public Supplier getSupplierBySupplierID(int supplierId) {
        if(supplierId == 0)
            return null;
        else
            return supplierDAO.getSupplierBySupplierID(supplierId);
    }

    @Override
    public Supplier updateSupplier(Supplier supplier) throws ShoppingException {
        return supplierDAO.updateSupplier(supplier);
    }

    @Override
    public int updateSupplierStatus(int supplierId, short isActive) throws Exception {
        try {
            if (supplierId == 0 || isActive < 0 || isActive > 1)
                return 0;

            int result = supplierDAO.updateSupplierStatus(supplierId, isActive);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("[updateSupplierStatus] error", e);
            return 0;
        }
    }

    @Override
    public Supplier addSupplier(Supplier supplier) throws ShoppingException {
        return supplierDAO.addSupplier(supplier);
    }
}
