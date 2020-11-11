package com.solt.jdc.autogeneratortype;

import com.solt.jdc.autogeneratortype.service.BookStoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutoGeneratorTypeApplication {

    private final BookStoreService bookStoreService;

    public AutoGeneratorTypeApplication(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AutoGeneratorTypeApplication.class, args);
    }

    @Bean
    public ApplicationRunner init(){
        return args -> {
            System.out.println("Persist good author...........");
            bookStoreService.persistGoodAuthor();

            System.out.println("Persist bad author.............");
            bookStoreService.persistBadAuthor();
        };
    }

}
