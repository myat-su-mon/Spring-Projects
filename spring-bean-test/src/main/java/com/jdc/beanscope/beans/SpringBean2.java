package com.jdc.beanscope.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
    public SpringBean2(){
        System.out.println("Creating " + getClass().getSimpleName() + " Singleton Bean");
    }
}
