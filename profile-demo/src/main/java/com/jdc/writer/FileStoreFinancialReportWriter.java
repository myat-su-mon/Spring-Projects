package com.jdc.writer;

import com.jdc.annotation.FileProfile;
import com.jdc.ds.FinancialMonthSummary;
import com.jdc.ds.FinancialQuarterSummary;
import com.jdc.ds.FinancialYearSummary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("file")
@FileProfile
public class FileStoreFinancialReportWriter implements FinancialReportWriter{
    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("File Writer => appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("File Writer => appendFinancialQuarterSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("File Writer => appendFinancialMonthSummary");
    }
}
