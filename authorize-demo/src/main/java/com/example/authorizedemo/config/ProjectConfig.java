package com.example.authorizedemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        var manager = new InMemoryUserDetailsManager();
        var user1 = User.withUsername("john")
                .password("12345")
                //.authorities("READ")
                //.authorities("ROLE_ADMIN")    //ROLE_PREFIX, GrantedAuthority represents a role
                .roles("ADMIN")
                .build();
        var user2 = User.withUsername("jane")
                .password("12345")
                //.authorities("WRITE")
                //.authorities("READ", "WRITE", "DELETE")
                //.authorities("ROLE_MANAGER")
                .roles("MANAGER")
                .build();
        manager.createUser(user1);
        manager.createUser(user2);
        return manager;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        // http.authorizeRequests().anyRequest().hasAuthority("WRITE");
        // http.authorizeRequests().anyRequest().hasAnyAuthority("WRITE", "READ");
        /* String expression = "hasAuthority('READ') and !hasAuthority('DELETE')";
        http.authorizeRequests().anyRequest().access(expression); */
        // http.authorizeRequests().anyRequest().hasRole("ADMIN");
        http.authorizeRequests().anyRequest().authenticated();
    }
}