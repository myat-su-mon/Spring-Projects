package com.jdc.writer;

import com.jdc.ds.FinancialMonthSummary;
import com.jdc.ds.FinancialQuarterSummary;
import com.jdc.ds.FinancialYearSummary;

public interface FinancialReportWriter {

    void appendFreeText(String title);
    void appendFinancialYearSummary(FinancialYearSummary financialYearSummary);
    void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary);
    void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary);
}
