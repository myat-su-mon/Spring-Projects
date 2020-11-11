package com.jdc.spel;

import com.jdc.spel.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Arrays;

public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.registerShutdownHook();

        context.register(AppConfig.class);
        context.refresh();

        System.out.println(Arrays.toString(context.getEnvironment().getActiveProfiles()));
        System.out.println(context.getEnvironment().getProperty("app.file.property"));
        System.out.println(context.getEnvironment().getProperty("app.vm.property"));
        System.out.println(context.getEnvironment().getProperty("app.env.property"));
        System.out.println(context.getEnvironment().getProperty("user.home"));
        System.out.println(context.getEnvironment().getProperty("JAVA_HOME"));
        System.out.println(context.getEnvironment().getProperty("MAVEN_HOME"));

        System.out.println(context.getBean(SpringBean.class).getAppFileProperty());
        System.out.println(context.getBean(SpringBean.class).getAppVmProperty());
        System.out.println(context.getBean(SpringBean.class).getAppEnvProperty());
        System.out.println(context.getBean(SpringBean.class).getUserHome());
        System.out.println(context.getBean(SpringBean.class).getJavaHome());
        System.out.println(context.getBean(SpringBean.class).getMavenHome());
    }
}
