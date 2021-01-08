package com.example.demosecured.services;


import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;

@Service
public class NameService {

   // @Secured("ROLE_ADMIN")
    @RolesAllowed("ROLE_ADMIN")
    public String getName(){
        return "Fantastic";
    }
}
