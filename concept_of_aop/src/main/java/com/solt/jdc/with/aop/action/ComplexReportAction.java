package com.solt.jdc.with.aop.action;

import com.solt.jdc.with.aop.bls.ComplexReportFormatter;
import com.solt.jdc.with.aop.bls.ComplexReportProvider;
import com.solt.jdc.with.aop.bls.ComplexReportRepository;
import com.solt.jdc.with.aop.ds.FormattedReport;
import com.solt.jdc.with.aop.ds.Report;
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

    public void perform() throws InterruptedException{
        Report report = complexReportProvider.getReport();
        FormattedReport formattedReport = complexReportFormatter.formattedReport(report);
        complexReportRepository.save(formattedReport);
        report = complexReportProvider.getReport();

    }
}
