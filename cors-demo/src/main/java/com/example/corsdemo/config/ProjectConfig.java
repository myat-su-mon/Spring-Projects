package com.example.corsdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.List;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors(
                c -> {
                    CorsConfigurationSource source = httpServletRequest -> {
                        CorsConfiguration config = new CorsConfiguration();
                        config.setAllowedOrigins(List.of("*"));
                        config.setAllowedMethods(List.of("*"));
                        config.setAllowedMethods(List.of("POST", "PUT", "GET"));
                        return config;
                    };
                    c.configurationSource(source);
                }
        );
        http.csrf().disable();
        http.authorizeRequests().anyRequest().permitAll();
    }
}
