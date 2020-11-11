package com.solt.jdc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "server")
public class ServerConfiguration {
    private String name;
    private String type;
    private String url;
}
