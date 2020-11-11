package com.jdc.beanscope.beans;

import com.jdc.beanscope.beans.ApplicationConfiguration;
import com.jdc.beanscope.beans.SpringBean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        SpringBean3 springBean3 = context.getBean(SpringBean3.class);
        SpringBean7 bean7 = context.getBean(SpringBean7.class);
    }
}
