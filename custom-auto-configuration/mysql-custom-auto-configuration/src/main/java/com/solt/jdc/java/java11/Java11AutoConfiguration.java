package com.solt.jdc.java.java11;

import com.solt.jdc.java.JavaEnvInfo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnJava(JavaVersion.ELEVEN)
public class Java11AutoConfiguration {

    @Bean
    public JavaEnvInfo javaEnvInfo(){
        return new Java11EnvInfo();
    }
}
