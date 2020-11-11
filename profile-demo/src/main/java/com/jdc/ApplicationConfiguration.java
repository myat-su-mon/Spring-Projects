package com.jdc;

import com.jdc.dao.DatabaseStoreFinancialDataDao;
import com.jdc.dao.FileStoreFinancialDataDao;
import com.jdc.dao.FinancialDataDao;
import com.jdc.service.FinancialReportService;
import com.jdc.writer.DatabaseStoreFinancialReportWriter;
import com.jdc.writer.FileStoreFinancialReportWriter;
import com.jdc.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfiguration {

//    @Bean
//    public FinancialReportService financialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter){
//        return new FinancialReportService(financialDataDao, financialReportWriter);
//    }

    @Bean
    @Profile("file")
    public FinancialDataDao fileStoreFinancialDataDao(){
        return new FileStoreFinancialDataDao();
    }

    @Bean
    @Profile("database")
    public FinancialDataDao databaseStoreFinancialDataDao(){
        return new DatabaseStoreFinancialDataDao();
    }

    @Bean
    @Profile("file")
    public FinancialReportWriter fileStoreFinancialReportWriter(){
        return new FileStoreFinancialReportWriter();
    }

    @Bean
    @Profile("database")
    public FinancialReportWriter databaseStoreFinancialReportWriter(){
        return new DatabaseStoreFinancialReportWriter();
    }

}
