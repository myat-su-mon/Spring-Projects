package com.solt.jdc.demo;

import com.solt.jdc.demo.service.EmployeeDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication implements CommandLineRunner {

    private final EmployeeDao employeeDao;

    public DemoApplication(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Fetching employees.......");
        employeeDao.findAll().forEach(System.out::println);
    }
}
