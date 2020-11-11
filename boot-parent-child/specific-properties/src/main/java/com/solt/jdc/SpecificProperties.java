package com.solt.jdc;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ServerConfiguration.class)
public class SpecificProperties {

    private final ServerConfiguration serverConfiguration;

    public SpecificProperties(ServerConfiguration serverConfiguration) {
        this.serverConfiguration = serverConfiguration;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpecificProperties.class, args);
    }

    @Bean
    public ApplicationRunner init(){
        return args -> {
            System.out.println(serverConfiguration);
        };
    }

}
