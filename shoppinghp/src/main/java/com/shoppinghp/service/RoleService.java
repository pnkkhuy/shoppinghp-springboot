package com.shoppinghp.service;

import com.shoppinghp.dao.IRoleDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IRoleDAO roleDAO;

    @Override
    public List<String> getAllRole() {
        return roleDAO.getAllRole();
    }
}
