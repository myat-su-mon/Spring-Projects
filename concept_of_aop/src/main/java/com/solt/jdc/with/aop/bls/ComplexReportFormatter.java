package com.solt.jdc.with.aop.bls;

import com.solt.jdc.with.aop.annotation.PerformanceLogger;
import com.solt.jdc.with.aop.ds.FormattedReport;
import com.solt.jdc.with.aop.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportFormatter {

    @PerformanceLogger
    public FormattedReport formattedReport(Report report) throws InterruptedException{
        System.out.println("Formatting the report....");
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("Report Formatted.");
        return new FormattedReport(report);
    }
}
