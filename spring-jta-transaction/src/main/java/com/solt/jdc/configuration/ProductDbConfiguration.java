package com.solt.jdc.configuration;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.mysql.cj.jdbc.MysqlXADataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@EnableJpaRepositories(
        basePackages = {"com.solt.jdc.db.products.dao"},
        entityManagerFactoryRef = "productEntityManagerFactory"
)
public class ProductDbConfiguration {

    @Bean
    @Autowired
    public LocalContainerEntityManagerFactoryBean productEntityManagerFactory(DataSource productDataSource){
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setJtaDataSource(productDataSource);
        em.setPackagesToScan("com.solt.jdc.db.products.ds");
        JpaVendorAdapter vendorAdaptor = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdaptor);
        return em;
    }

    @Bean
    public DataSource productDataSource() throws SQLException{
        MysqlXADataSource mysqlXADataSource = new MysqlXADataSource();
        mysqlXADataSource.setURL("jdbc:mysql://localhost:3306/newdb2");
        mysqlXADataSource.setUser("root");
        mysqlXADataSource.setPassword("password");
        mysqlXADataSource.setPinGlobalTxToPhysicalConnection(true);

        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSource(mysqlXADataSource);
        atomikosDataSourceBean.setUniqueResourceName("productDb");
        return atomikosDataSourceBean;
    }
}
