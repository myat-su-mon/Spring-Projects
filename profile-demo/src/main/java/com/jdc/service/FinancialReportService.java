package com.jdc.service;

import com.jdc.dao.FinancialDataDao;
import com.jdc.ds.FinancialMonthSummary;
import com.jdc.ds.FinancialQuarterSummary;
import com.jdc.ds.FinancialYearSummary;
import com.jdc.writer.FinancialReportWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportService {

//    private final FinancialDataDao financialDataDao;
//    private final FinancialReportWriter financialReportWriter;
//
//    public FinancialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter) {
//        this.financialDataDao = financialDataDao;
//        this.financialReportWriter = financialReportWriter;
//    }

    @Autowired
    private FinancialDataDao financialDataDao;
    @Autowired
    private FinancialReportWriter financialReportWriter;

    public void generateReport(){
        FinancialYearSummary financialYearSummary = financialDataDao.financialYearSummary(2020);
        FinancialQuarterSummary financialQuarterSummary = financialDataDao.financialQuarterSummary(2020,1);
        FinancialMonthSummary financialMonthSummary = financialDataDao.financialMonthSummary(2020,4);

        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
        financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
        financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
    }
}
