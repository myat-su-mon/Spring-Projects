package com.jdc.dao;

import com.jdc.ds.FinancialMonthSummary;
import com.jdc.ds.FinancialQuarterSummary;
import com.jdc.ds.FinancialYearSummary;

public interface FinancialDataDao {

    FinancialYearSummary financialYearSummary(int year);
    FinancialQuarterSummary financialQuarterSummary(int year, int quarter);
    FinancialMonthSummary financialMonthSummary(int year, int month);
}
