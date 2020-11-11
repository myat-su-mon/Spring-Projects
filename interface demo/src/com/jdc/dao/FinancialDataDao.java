package com.jdc.dao;

import com.jdc.ds.FinancialMonthSummary;
import com.jdc.ds.FinancialQuarterSummary;
import com.jdc.ds.FinancialYearSummary;

public interface FinancialDataDao {

    FinancialYearSummary findFinancialYearSummary(int year);
    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);
    FinancialMonthSummary findFinancialMonthSummary(int year, int month);
}
