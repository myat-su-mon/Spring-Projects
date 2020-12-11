package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    // Spring Security Code Places to analyze:
    // DelegatingFilterProxy.doFilter
    // FilterChainProxy.doFilterInternal
    // ProviderManager.authenticate
    // RoleVoter.vote
    // AffirmativeBased.decide
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
