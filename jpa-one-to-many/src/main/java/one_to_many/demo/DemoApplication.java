package one_to_many.demo;

import one_to_many.demo.service.BookStoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

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
            System.out.println("Insert one author with three books.");
            bookStoreService.insertAuthorWithBooks();
            bookStoreService.deleteBooksOfAuthor();
        };
    }

}
