package com.example.demo.security.annotation.customer;

import static com.example.demo.security.SecurityRoles.*;
import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLE_PREFIX + CUSTOMERS_ADMIN)
public @interface IsCustomerAdmin {
}
