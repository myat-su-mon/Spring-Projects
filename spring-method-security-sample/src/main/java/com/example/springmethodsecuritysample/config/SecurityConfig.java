package com.example.springmethodsecuritysample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableGlobalMethodSecurity
public class SecurityConfig {

    public UserDetailsService userDetailsService() {
        var service = new InMemoryUserDetailsManager();

        var user1 = User.withUsername("natalie")
                .password("12345")
                .authorities("read")
                .build();

        var user2 = User.withUsername("emma")
                .password("12345")
                .authorities("write")
                .build();

        service.createUser(user1);
        service.createUser(user2);
        return service;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
