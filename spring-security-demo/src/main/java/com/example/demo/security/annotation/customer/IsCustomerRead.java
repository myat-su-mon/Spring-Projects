package com.example.demo.security.annotation.customer;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.example.demo.security.SecurityRoles.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLE_PREFIX + CUSTOMERS_READ)
public @interface IsCustomerRead {
}
