package com.solt.jdc.java.java8;

import com.solt.jdc.java.JavaEnvInfo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnJava(value = JavaVersion.EIGHT,range = ConditionalOnJava.Range.OLDER_THAN)
public class Java8AutoConfiguration {

    @Bean
    public JavaEnvInfo javaEnvInfo(){
        return new Java8EnvInfo();
    }
}
