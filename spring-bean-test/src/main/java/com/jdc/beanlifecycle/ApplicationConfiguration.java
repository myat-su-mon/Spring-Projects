package com.jdc.beanlifecycle;

import com.jdc.beanlifecycle.beans.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfiguration {

//    @Bean
//    public static CustomBeanFactoryPostProcessor customBeanFactoryPostProcessor(){
//        return new CustomBeanFactoryPostProcessor();
//    }
//
//    @Bean
//    public static CustomBeanPostProcessor customBeanPostProcessor(){
//        return new CustomBeanPostProcessor();
//    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public SpringBean1 springBean1(){
        return new SpringBean1();
    }
}
