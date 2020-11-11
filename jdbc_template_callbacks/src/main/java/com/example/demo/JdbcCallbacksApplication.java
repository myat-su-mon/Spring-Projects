package com.example.demo;

import com.example.demo.service.EmployeeReportService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcCallbacksApplication implements CommandLineRunner {

    private final EmployeeReportService employeeReportService;

    public JdbcCallbacksApplication(EmployeeReportService employeeReportService){
        this.employeeReportService = employeeReportService;
    }

    public static void main(String[] args) {
        SpringApplication.run(JdbcCallbacksApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeReportService.printReport();
    }
}
