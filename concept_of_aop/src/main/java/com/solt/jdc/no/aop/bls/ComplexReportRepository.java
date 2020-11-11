package com.solt.jdc.no.aop.bls;

import com.solt.jdc.no.aop.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportRepository {
    public void save(Report report) throws InterruptedException{
        System.out.println("Saving the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Report Saved.");
    }
}
