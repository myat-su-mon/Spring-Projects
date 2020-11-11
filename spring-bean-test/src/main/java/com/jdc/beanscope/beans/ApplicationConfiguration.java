package com.jdc.beanscope.beans;

import com.jdc.beanscope.beans.SpringBean7;
import com.jdc.beanscope.beans.SpringBean8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ComponentScan
@Configuration
public class ApplicationConfiguration {
    @Lazy
    @Bean
    public SpringBean7 springBean7(){
        return new SpringBean7();
    }
    @Bean
    public SpringBean8 springBean8(){
        return new SpringBean8();
    }

}
