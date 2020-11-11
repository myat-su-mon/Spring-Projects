package com.solt.jdc.no.aop.bls;

import com.solt.jdc.no.aop.ds.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportProvider {
    public Report getReport() throws InterruptedException{
        System.out.println("Fetching the Report....");
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        System.out.println("Report created.");
        return new Report();
    }
}
