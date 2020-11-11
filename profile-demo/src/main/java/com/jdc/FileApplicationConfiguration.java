package com.jdc;

import com.jdc.dao.FileStoreFinancialDataDao;
import com.jdc.dao.FinancialDataDao;
import com.jdc.writer.FileStoreFinancialReportWriter;
import com.jdc.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
//@Profile("file")
public class FileApplicationConfiguration {
    @Bean
    public FinancialDataDao fileStoreFinancialDataDao(){
        return new FileStoreFinancialDataDao();
    }

    @Bean
    public FinancialReportWriter fileStoreFinancialReportWriter(){
        return new FileStoreFinancialReportWriter();
    }
}
