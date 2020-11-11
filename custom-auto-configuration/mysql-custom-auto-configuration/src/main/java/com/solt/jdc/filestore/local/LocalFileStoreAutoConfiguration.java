package com.solt.jdc.filestore.local;

import com.solt.jdc.filestore.FileStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "file.store", havingValue = "local")
public class LocalFileStoreAutoConfiguration {

    @Bean
    public FileStore fileStore(){
        return new LocalFileStore();
    }
}
