package com.jdc;

import com.jdc.service.FinancialReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();

        // Activate Profile
        context.getEnvironment().setActiveProfiles("file");
        context.register(ApplicationConfiguration4.class);
        context.refresh();

        FinancialReportService financialReportService = context.getBean(FinancialReportService.class);
        financialReportService.generateReport();
    }
}
