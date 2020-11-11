package com.jdc.dao;

import com.jdc.annotation.FileProfile;
import com.jdc.ds.FinancialMonthSummary;
import com.jdc.ds.FinancialQuarterSummary;
import com.jdc.ds.FinancialYearSummary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("file")
@FileProfile
public class FileStoreFinancialDataDao implements FinancialDataDao{
    @Override
    public FinancialYearSummary financialYearSummary(int year) {
        System.out.println("File Dao => financialYearSummary");
        return new FinancialYearSummary();
    }

    @Override
    public FinancialQuarterSummary financialQuarterSummary(int year, int quarter) {
        System.out.println("File Dao => financialQuarterSummary");
        return new FinancialQuarterSummary();
    }

    @Override
    public FinancialMonthSummary financialMonthSummary(int year, int month) {
        System.out.println("File Dao => financialMonthSummary");
        return new FinancialMonthSummary();
    }
}
