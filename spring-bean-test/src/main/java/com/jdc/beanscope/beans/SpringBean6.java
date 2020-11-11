package com.jdc.beanscope.beans;

import org.springframework.context.annotation.Scope;

//@Component
@Scope("prototype")
public class SpringBean6 {
    public SpringBean6(){
        System.out.println("Creating " + getClass().getSimpleName() + " Prototype Bean is referenced from Singleton Bean SpringBean5");
    }
}
