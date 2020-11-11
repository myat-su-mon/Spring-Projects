package com.example.accesspropertiesboot;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
@Getter
@Setter
@ToString
public class AppConfiguration {
    private int propertyA;
    private int propertyB;
    private int propertyC;
    private int propertyD;
    private int propertyE;
    private int propertyF;
    private int propertyG;
    private int propertyH;
    private int propertyI;
    private int propertyJ;
    private int propertyK;
    private int propertyL;
}
