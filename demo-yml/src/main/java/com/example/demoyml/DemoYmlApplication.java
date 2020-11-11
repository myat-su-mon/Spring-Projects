package com.example.demoyml;

import com.example.demoyml.configuration.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfiguration.class)
public class DemoYmlApplication {

    private ApplicationConfiguration applicationConfiguration;

    public DemoYmlApplication(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoYmlApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(){
        return args -> {
            System.out.println("Configuration injected from properties.");
            System.out.println(applicationConfiguration);
        };
    }
}
