package com.everpm.authentication.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("userDetailsServiceDbImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    //todo add slf4j logs
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //todo implement database based user details service
        System.out.println("authenticate user with username " + username);
        if (username.equals("user")) {
            //todo change the test password
            return new User(username, "password", AuthorityUtils.createAuthorityList("USER"));
        } else if (username.equals("admin")) {
            //todo change the test password
            return new User(username, "password", AuthorityUtils.createAuthorityList("ADMIN"));
        }
        throw new UsernameNotFoundException("not found : " + username);
    }
}
