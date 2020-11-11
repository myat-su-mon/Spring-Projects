package com.solt.jdc.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeRepositoryAspect {

//    @Before("execution(* com.solt.jdc.service.a.EmployeeRepository.findEmployeeById(..))")
//    public void beforeFindEmployeeById(){
//        System.out.println("Service A - BeforeFindEmployeeById");
//    }
//
//    @After("within(com.solt.jdc.service.a.*)")
//    public void afterExecutionWithinPackage(){
//        System.out.println("Service A - afterExecutionWithinPackage");
//    }

    @Pointcut("within(com.solt.jdc.service.*.*) || within(com.solt.jdc.*)")
    public void serviceOrSamePackageRepository(){}

    @Before("serviceOrSamePackageRepository()")
    public void before(JoinPoint joinPoint){
        System.out.println("before - " + joinPoint.getSignature());
    }

    @After("serviceOrSamePackageRepository()")
    public void after(JoinPoint joinPoint){
        System.out.println("after - " + joinPoint.getSignature());
    }
}
