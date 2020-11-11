package com.jdc.beanlifecycle;

import com.jdc.beanlifecycle.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerMain {

    public static void main(String[] args) {
       try(AnnotationConfigApplicationContext context =
               new AnnotationConfigApplicationContext(ApplicationConfiguration.class)){
           SpringBean1 springBean1 = context.getBean(SpringBean1.class);
           System.out.println(springBean1.sayGreeting("Myat Su"));
       }
    }
}
