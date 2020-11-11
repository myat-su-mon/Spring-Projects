package com.solt.jdc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class AlternativeCurrenciesRepositoryAspect {
    @Before("this(com.solt.jdc.bls.AlternativeCurrenciesRepository)")
    public void beforeThisCurrenciesRepository(){
        System.out.println("Before - this(AlternativeCurrenciesRepositoryAspect)");
    }

    @Before("target(com.solt.jdc.bls.AlternativeCurrenciesRepository)")
    public void beforeTargetCurrenciesRepository(){
        System.out.println("Before - target(AlternativeCurrenciesRepositoryAspect)");
    }
}
