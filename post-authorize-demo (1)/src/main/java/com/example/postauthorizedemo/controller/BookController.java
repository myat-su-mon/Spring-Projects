package com.example.postauthorizedemo.controller;


import com.example.postauthorizedemo.model.Employee;
import com.example.postauthorizedemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    //curl -u emma:12345 http://localhost:8080/book/details/emma
    //curl -u natalie:12345 http://localhost:8080/book/details/emma
    //curl -u emma:12345 http://localhost:8080/book/details/natalie
    @GetMapping("/book/details/{name}")
    public Employee getDetails(@PathVariable String name){
        return bookService.getBookDetails(name);
    }
}
