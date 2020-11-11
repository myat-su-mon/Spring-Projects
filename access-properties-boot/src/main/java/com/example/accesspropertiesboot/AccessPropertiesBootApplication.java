package com.example.accesspropertiesboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppConfiguration.class)
public class AccessPropertiesBootApplication implements CommandLineRunner {

    private final AppConfiguration appConfiguration;

    public AccessPropertiesBootApplication(AppConfiguration appConfiguration) {
        this.appConfiguration = appConfiguration;
    }

    public static void main(String[] args) {
        SpringApplication.run(AccessPropertiesBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(appConfiguration);
    }
}
