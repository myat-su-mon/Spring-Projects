package com.solt.jdc.db;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "mysql")
public class MySqlProperties {
    private String host;
    private int port;
    private String dbname;
    private String username;
    private String password;
}
