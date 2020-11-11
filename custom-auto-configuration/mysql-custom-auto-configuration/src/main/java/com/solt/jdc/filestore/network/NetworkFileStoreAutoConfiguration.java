package com.solt.jdc.filestore.network;

import com.solt.jdc.filestore.FileStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "file.store", havingValue = "network")
public class NetworkFileStoreAutoConfiguration {

    @Bean
    public FileStore networkFileStore(){
        return new NetworkFileStore();
    }
}
