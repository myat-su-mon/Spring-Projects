package com.solt.jdc.with.aop.bls;

import com.solt.jdc.with.aop.annotation.Cacheable;
import com.solt.jdc.with.aop.annotation.PerformanceLogger;
import com.solt.jdc.with.aop.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportProvider {

    @PerformanceLogger
    @Cacheable
    public Report getReport() throws InterruptedException{
        System.out.println("Fetching the Report....");
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        System.out.println("Report created.");
        return new Report();
    }
}
