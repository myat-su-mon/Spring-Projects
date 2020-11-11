package com.jdc.service;

import com.jdc.dao.FinancialDataDao;
import com.jdc.ds.FinancialMonthSummary;
import com.jdc.ds.FinancialQuarterSummary;
import com.jdc.ds.FinancialYearSummary;
import com.jdc.writer.FinancialReportWriter;

public class SimpleFinancialReportService {

    private final FinancialDataDao financialDataDao;
    private final FinancialReportWriter financialReportWriter;

    public SimpleFinancialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    public void generateReport() {
        FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2020);
        FinancialQuarterSummary financialQuarterSummary = financialDataDao.findFinancialQuarterSummary(2020,3);
        FinancialMonthSummary financialMonthSummary = financialDataDao.findFinancialMonthSummary(2020,3);
        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
        financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
        financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
    }
}
