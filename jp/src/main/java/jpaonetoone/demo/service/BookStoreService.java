package jpaonetoone.demo.service;

import jpaonetoone.demo.entity.Author;
import jpaonetoone.demo.entity.Book;
import jpaonetoone.demo.repository.AuthorRepository;
import jpaonetoone.demo.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookStoreService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BookStoreService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Author findAuthorById(long id){
        return authorRepository.getOne(id);
    }

    public Book findBookById(long id){
        return bookRepository.getOne(id);
    }

    @Transactional
    public void createAuthorAndBooks(){
        Author author1 = new Author("Thomas", "Horror", 34);
        Author author2 = new Author("William", "Romance", 40);
        Author author3 = new Author("James", "History", 45);

        Book book1 = new Book("Dark Night", "abc12345");
        Book book2 = new Book("Blue Moon", "abc11111");
        Book book3 = new Book("Roman Emperor", "abc22222");

        author1.setBook(book1);
        author2.setBook(book2);

        authorRepository.save(author1);
        authorRepository.save(author2);
    }




}
