package com.solt.jdc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class CurrencyRepositoryAspect {
    @Before("this(com.solt.jdc.bls.CurrenciesRepository)")
    public void beforeThisCurrenciesRepository(){
        System.out.println("Before - this(CurrencyRepositoryImpl)");
    }

    @Before("target(com.solt.jdc.bls.CurrenciesRepositoryImpl)")
    public void beforeTargetCurrenciesRepository(){
        System.out.println("Before - target(CurrencyRepositoryImpl)");
    }
}
