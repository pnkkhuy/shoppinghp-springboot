package com.shoppinghp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.shoppinghp.controller.advice.LoginControllerAdvice;
import com.shoppinghp.dao.AccountDAO;
import com.shoppinghp.entity.Account;
import com.shoppinghp.utils.JsonClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsService")
public class MyUserDetailService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(MyUserDetailService.class);

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        if(username == null && username.isEmpty())
            throw new UsernameNotFoundException(username);

        Account account =  accountDAO.getAccountLogin(username);

        if(account == null || account.getEmail().isEmpty())
            throw new UsernameNotFoundException(username);

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>() {{
            add(new SimpleGrantedAuthority(account.getRole()));
        }};
        return buildUserForAuthentication(account, authorities);
    }

    private User buildUserForAuthentication(Account account, List<GrantedAuthority> authorities) {
        return new User(account.getEmail(), passwordEncoder().encode(account.getPassword()),
                        account.getIsActiveBoolean(),
                        true, true, true,
                        authorities);
    }

    public PasswordEncoder passwordEncoder(){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }
}
