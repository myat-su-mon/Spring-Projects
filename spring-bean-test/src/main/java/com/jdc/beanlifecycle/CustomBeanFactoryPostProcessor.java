package com.jdc.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        System.out.println(getClass().getSimpleName()+"::postProcessBeanFactory Listing Bean Start");
//        Arrays.stream(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println(getClass().getSimpleName()+"::postProcessBeanFactory Listing Bean End");
        System.out.println(getClass().getSimpleName() + "::postProcessBeanFactory");

    }
}
