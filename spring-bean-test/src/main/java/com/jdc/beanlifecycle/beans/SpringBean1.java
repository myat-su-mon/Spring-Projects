package com.jdc.beanlifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean1 implements InitializingBean, DisposableBean {

    private SpringBean2 springBean2;

    public SpringBean1(){
        System.out.println(getClass().getSimpleName() + "::Constructor");
    }

    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println(getClass().getSimpleName()+"::Set SpringBean 2");
        this.springBean2 = springBean2;
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct" + getClass().getSimpleName() + "::Init");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("@PreDestroy " + getClass().getSimpleName() + "::Destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean :: afterPropertiesSet " + getClass().getSimpleName());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean :: destroy " + getClass().getSimpleName());
    }

    private void initMethod(){
        System.out.println("@Bean(initMethod) " + getClass().getSimpleName());
    }

    private void destroyMethod(){
        System.out.println("@Bean(destroyMethod) " + getClass().getSimpleName());
    }

    public String sayGreeting(String name){
        return "Hello" + name;
    }
}
