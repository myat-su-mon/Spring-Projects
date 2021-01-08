package com.solt.jdc.securityfilterinrepository.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.data.repository.query.SecurityEvaluationContextExtension;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ProjectConfig {
    @Bean
    public SecurityEvaluationContextExtension securityEvaluationContextExtension(){
        return new SecurityEvaluationContextExtension();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        var uds=new InMemoryUserDetailsManager();

        var user1= User.withUsername("niko")
                .password("12345")
                .authorities("read")
                .build();

        var user2=User.withUsername("julien")
                .password("12345")
                .authorities("write")
                .build();

        uds.createUser(user1);
        uds.createUser(user2);
        return uds;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}
