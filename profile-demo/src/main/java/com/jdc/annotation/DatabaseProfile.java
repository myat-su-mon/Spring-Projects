package com.jdc.annotation;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Profile("database")
@Retention(RetentionPolicy.RUNTIME)
public @interface DatabaseProfile {
}
