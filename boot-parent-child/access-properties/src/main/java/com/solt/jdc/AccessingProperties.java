package com.solt.jdc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableConfigurationProperties(AppConfiguration.class)
public class AccessingProperties implements CommandLineRunner {

    private final AppConfiguration appConfiguration;
    private final Environment environment;
    @Value("${app.propertyB}")
    private String propertyB;

    public AccessingProperties(AppConfiguration appConfiguration, Environment environment) {
        this.appConfiguration = appConfiguration;
        this.environment = environment;
    }

    public static void main(String[] args) {
        SpringApplication.run(AccessingProperties.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(String.format("app.propertyA = %s ",appConfiguration.getPropertyA()));
        System.out.println(String.format("app.propertyB = %s ",propertyB));
        System.out.println(String.format("app.propertyC = %s ",environment.getProperty("app.propertyC")));
    }
}
