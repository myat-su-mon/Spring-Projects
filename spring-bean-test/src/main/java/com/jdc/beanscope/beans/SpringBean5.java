package com.jdc.beanscope.beans;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class SpringBean5 {
    @Autowired
    private SpringBean6 springBean6;

    public SpringBean5(){
        System.out.println("Creating " + getClass().getSimpleName() + " Singleton Bean that has dependency on Prototype Bean SpringBean6");
    }

}
