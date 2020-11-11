package com.example.demojdbcdatasource;

import com.example.demojdbcdatasource.service.EmployeeReportService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJdbcDatasourceApplication implements CommandLineRunner {

    private final EmployeeReportService employeeReportService;

    public DemoJdbcDatasourceApplication(EmployeeReportService employeeReportService) {
        this.employeeReportService = employeeReportService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoJdbcDatasourceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeReportService.printReport();
    }
}
