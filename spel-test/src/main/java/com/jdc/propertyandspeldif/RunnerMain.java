package com.jdc.propertyandspeldif;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        SpringBean springBean = context.getBean(SpringBean.class);

        System.out.println(springBean.getAppFileProperty());
        System.out.println(springBean.getJavaHome());

        System.out.println();
        System.out.println(springBean.getAdditionalResult());
        System.out.println(springBean.getCityName());
        System.out.println(springBean.getCurrentDate());
        System.out.println(springBean.getJavaHomeSpel());

    }
}
