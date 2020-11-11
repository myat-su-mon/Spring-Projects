package com.solt.jdc.regularjar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegularJarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RegularJarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello form Regular Jar..........");
    }
}
