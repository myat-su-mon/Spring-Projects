package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Student student(){
        return new Student(address());
    }

    @Bean
    public Address address(){
        Address address = new Address();
        return address;
    }
}
