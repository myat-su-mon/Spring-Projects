package com.jdc.spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    @Value("${app.file.property}")
    private String appFileProperty;
    @Value("${app.vm.property}")
    private String appVmProperty;
    @Value("${app.env.property}")
    private String appEnvProperty;
    @Value("${user.home}")
    private String userHome;
    @Value("${JAVA_HOME}")
    private String javaHome;
    @Value("${MAVEN_HOME}")
    private String mavenHome;

    public String getAppFileProperty() {
        return appFileProperty;
    }

    public void setAppFileProperty(String appFileProperty) {
        this.appFileProperty = appFileProperty;
    }

    public String getAppVmProperty() {
        return appVmProperty;
    }

    public void setAppVmProperty(String appVmProperty) {
        this.appVmProperty = appVmProperty;
    }

    public String getAppEnvProperty() {
        return appEnvProperty;
    }

    public void setAppEnvProperty(String appEnvProperty) {
        this.appEnvProperty = appEnvProperty;
    }

    public String getUserHome() {
        return userHome;
    }

    public void setUserHome(String userHome) {
        this.userHome = userHome;
    }

    public String getJavaHome() {
        return javaHome;
    }

    public void setJavaHome(String javaHome) {
        this.javaHome = javaHome;
    }

    public String getMavenHome() {
        return mavenHome;
    }

    public void setMavenHome(String mavenHome) {
        this.mavenHome = mavenHome;
    }
}
