package com.example.businesslogicserver.authentication;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class UsernamePasswordAuthentication extends UsernamePasswordAuthenticationToken {

    public UsernamePasswordAuthentication(Object principal, Object credentials) {
        super(principal, credentials);
    }
}
