package com.jdc;

import com.jdc.dao.DatabaseStoreFinancialDataDao;
import com.jdc.dao.FileStoreFinancialDataDao;
import com.jdc.service.SimpleFinancialReportService;
import com.jdc.writer.DatabaseStoreFinancialReportWriter;
import com.jdc.writer.FileStoreFinancialReportWriter;

public class Main {
    public static void main(String[] args) {
        SimpleFinancialReportService simpleFinancialReportService = new SimpleFinancialReportService(
                new DatabaseStoreFinancialDataDao(), new DatabaseStoreFinancialReportWriter());
        simpleFinancialReportService.generateReport();
    }
}
