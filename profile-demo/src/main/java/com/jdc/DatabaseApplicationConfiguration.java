package com.jdc;

import com.jdc.dao.DatabaseStoreFinancialDataDao;
import com.jdc.dao.FinancialDataDao;
import com.jdc.writer.DatabaseStoreFinancialReportWriter;
import com.jdc.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
//@Profile("database")
public class DatabaseApplicationConfiguration {
    @Bean
    public FinancialDataDao databaseStoreFinancialDataDao(){
        return new DatabaseStoreFinancialDataDao();
    }

    @Bean
    public FinancialReportWriter databaseStoreFinancialReportWriter(){
        return new DatabaseStoreFinancialReportWriter();
    }
}
