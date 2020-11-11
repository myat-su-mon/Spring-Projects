package com.solt.jdc.no.aop.action;

import com.solt.jdc.no.aop.bls.ComplexReportFormatter;
import com.solt.jdc.no.aop.bls.ComplexReportProvider;
import com.solt.jdc.no.aop.bls.ComplexReportRepository;
import com.solt.jdc.no.aop.ds.FormattedReport;
import com.solt.jdc.no.aop.ds.Report;
import com.solt.jdc.no.aop.logger.PerformanceLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComplexReportAction {

    @Autowired
    private ComplexReportProvider complexReportProvider;
    @Autowired
    private ComplexReportFormatter complexReportFormatter;
    @Autowired
    private ComplexReportRepository complexReportRepository;
    @Autowired
    private PerformanceLogger performanceLogger;

    public void perform() throws InterruptedException{
        PerformanceLogger.PerformanceLoggerInfo performanceLoggerInfo;
        performanceLoggerInfo = performanceLogger.start("complexReportProvider.getReport()");
        Report report = complexReportProvider.getReport();
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("complexReportFormatter.formatReport(...)");
        FormattedReport formattedReport = complexReportFormatter.formattedReport(report);
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("complexRepository.save(...)");
        complexReportRepository.save(formattedReport);
        performanceLogger.stop(performanceLoggerInfo);

        performanceLoggerInfo = performanceLogger.start("complexReportProvider.getReport()");
        report = complexReportProvider.getReport();
        performanceLogger.stop(performanceLoggerInfo);

    }
}
