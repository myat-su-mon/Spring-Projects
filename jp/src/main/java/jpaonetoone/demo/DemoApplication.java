package jpaonetoone.demo;

import jpaonetoone.demo.entity.Author;
import jpaonetoone.demo.entity.Book;
import jpaonetoone.demo.service.BookStoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication{

    private final BookStoreService bookStoreService;

    public DemoApplication(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public ApplicationRunner init(){
        return args -> {
            bookStoreService.createAuthorAndBooks();
        };
    }
}
