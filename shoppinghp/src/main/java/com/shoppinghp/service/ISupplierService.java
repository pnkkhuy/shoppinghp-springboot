package com.shoppinghp.service;

import com.shoppinghp.entity.Category;
import com.shoppinghp.entity.Supplier;
import com.shoppinghp.exception.ShoppingException;

import java.util.List;

public interface ISupplierService {
    List<Supplier> getAllSupplier();
    Supplier getSupplierBySupplierID(int supplierId);
    Supplier updateSupplier(Supplier supplier) throws ShoppingException;
    int updateSupplierStatus(int supplierId, short isActive) throws Exception;
    Supplier addSupplier(Supplier supplier) throws ShoppingException;
}
