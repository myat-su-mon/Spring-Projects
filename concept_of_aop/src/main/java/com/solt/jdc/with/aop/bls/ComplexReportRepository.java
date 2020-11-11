package com.solt.jdc.with.aop.bls;

import com.solt.jdc.with.aop.annotation.PerformanceLogger;
import com.solt.jdc.with.aop.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportRepository {

    @PerformanceLogger
    public void save(Report report) throws InterruptedException{
        System.out.println("Saving the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Report Saved.");
    }
}
