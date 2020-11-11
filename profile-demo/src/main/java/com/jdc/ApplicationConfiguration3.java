package com.jdc;

import com.jdc.DatabaseApplicationConfiguration;
import com.jdc.FileApplicationConfiguration;
import com.jdc.dao.FinancialDataDao;
import com.jdc.service.FinancialReportService;
import com.jdc.writer.FinancialReportWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
//@Import({DatabaseApplicationConfiguration.class, FileApplicationConfiguration.class})
public class ApplicationConfiguration3 {
//    @Bean
//    public FinancialReportService financialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter){
//        return new FinancialReportService(financialDataDao, financialReportWriter);
//    }
}
