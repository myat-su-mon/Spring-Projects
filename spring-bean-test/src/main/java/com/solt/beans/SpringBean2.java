package com.solt.beans;

public class SpringBean2 {

    private void destroy(){
        System.out.println(getClass().getSimpleName() + " :: destroy method");
    }
}
