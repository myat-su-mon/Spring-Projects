package com.solt.jdc.aspect;

import javax.sql.DataSource;
import java.lang.reflect.Proxy;

public class DataSourceProxyFactory {

    public static DataSource createDataSourceProxy(DataSource dataSource){
        return (DataSource) Proxy.newProxyInstance(
                DataSourceProxyFactory.class.getClassLoader(),
                new Class[]{DataSource.class},
                new DataSourceInvocationHandler(dataSource));
    }
}
