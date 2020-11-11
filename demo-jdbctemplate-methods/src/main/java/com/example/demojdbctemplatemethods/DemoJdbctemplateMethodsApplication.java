package com.example.demojdbctemplatemethods;

import com.example.demojdbctemplatemethods.service.EmployeeReportService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJdbctemplateMethodsApplication implements CommandLineRunner {

    private final EmployeeReportService employeeReportService;

    public DemoJdbctemplateMethodsApplication(EmployeeReportService employeeReportService){
        this.employeeReportService = employeeReportService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoJdbctemplateMethodsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeReportService.printReport();
    }
}
