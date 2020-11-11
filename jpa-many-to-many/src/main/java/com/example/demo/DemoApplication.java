package com.example.demo;

import com.example.demo.service.SpeakerEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private final SpeakerEventService speakerEventService;

    public DemoApplication(SpeakerEventService speakerEventService) {
        this.speakerEventService = speakerEventService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public ApplicationRunner init(){
        return args -> {
            speakerEventService.insertSpeakerEvent();
        };
    }

}
