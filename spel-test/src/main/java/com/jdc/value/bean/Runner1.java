package com.jdc.value.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Runner1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();

        SpringBean springBean = context.getBean(SpringBean.class);
        SpringBean2 springBean2 = context.getBean(SpringBean2.class);
        System.out.println("getName = " + springBean.getName());
        System.out.println("getStreetName = " + springBean.getStreetName());
        System.out.println("isAccountExist = " + springBean.isAccountExists());
        System.out.println("getIntNumber = " + springBean.getIntNumber());
        System.out.println("getAccountBalance = " + springBean.getAccountBalance());
        System.out.println("getDepartmentId = " + springBean.getDepartmentId());
        System.out.println("getDepartmentName = " + springBean.getDepartmentName());
        System.out.println("getManagerName = " + springBean.getManagerName());
        System.out.println("getSupportContactMail = " + springBean.getSupportContactMail());
        System.out.println("getSupportContactPhone = " + springBean.getSupportPhone());
        System.out.println("getSupportContactAddress = " + springBean.getSupportAddress());
        System.out.println("getDependentDepartments = " + Arrays.toString(springBean.getDependentDepartments()));
        System.out.println("getCaseIds = " + springBean.getCaseIds());
        System.out.println("getCaseSet = " + springBean.getCaseSet());
        System.out.println("getCaseMap = " + springBean.getCaseMap());
        //System.out.println("getTaxValue = " + springBean.getTaxId());

//        System.out.println("getTaxValue = " + springBean2.getTaxValue());
//        System.out.println("getTaxDepartmentName = " + springBean2.getTaxDepartmentName());
//        System.out.println("getTaxDepartmentAlternativeName = " + springBean2.getTaxDepartmentAlternativeName());
    }
}
