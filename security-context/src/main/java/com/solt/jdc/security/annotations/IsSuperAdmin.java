package com.solt.jdc.security.annotations;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.solt.jdc.security.SecurityRoles.ROLE_PREFIX;
import static com.solt.jdc.security.SecurityRoles.SUPER_ADMIN;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLE_PREFIX + SUPER_ADMIN)
public @interface IsSuperAdmin {
}
