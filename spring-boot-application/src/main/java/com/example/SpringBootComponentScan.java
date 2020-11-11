package com.example;

import com.example.service.ServiceA;
import com.extra.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {SpringBootComponentScan.class, ServiceB.class})
public class SpringBootComponentScan {

    @Autowired
    private ServiceA serviceA;

    @Autowired
    private ServiceB serviceB;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootComponentScan.class, args);
    }
}
