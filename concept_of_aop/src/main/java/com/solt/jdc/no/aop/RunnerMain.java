package com.solt.jdc.no.aop;

import com.solt.jdc.no.aop.action.ComplexReportAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerMain {
    public static void main(String[] args) throws InterruptedException{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        ComplexReportAction complexReportAction = context.getBean(ComplexReportAction.class);
        complexReportAction.perform();
    }
}
