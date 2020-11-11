package one_to_many.demo.service;

import one_to_many.demo.entities.Author;
import one_to_many.demo.entities.Book;
import one_to_many.demo.repository.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookStoreService {

    private final AuthorRepository authorRepository;

    public BookStoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public void insertAuthorWithBooks() {
        Author jn = new Author("Joana Nimar", "History", 35);
        Book book1 = new Book("World History", "001-JN");
        Book book2 = new Book("Ancient History", "002-JN");
        Book book3 = new Book("War History", "003-JN");

        jn.addBooks(book1);
        jn.addBooks(book2);
        jn.addBooks(book3);

        authorRepository.save(jn);
    }

    @Transactional
    public void deleteBooksOfAuthor(){
        Author author = authorRepository.fetchByName("Joana Nimar");
        Book book1 = author.getBooks().get(1);
        author.removeBook(book1);
    }
}
