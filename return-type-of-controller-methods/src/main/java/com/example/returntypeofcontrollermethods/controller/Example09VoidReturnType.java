package com.example.returntypeofcontrollermethods.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Controller
public class Example09VoidReturnType {

    @GetMapping("/example09A")
    @ResponseStatus(code = HttpStatus.FOUND)
    public void example09A(){

    }

    @GetMapping("/hello")
    public void example09B(){

    }

    @GetMapping("/example09C")
    public void example09C(ServletResponse servletResponse) throws IOException {
        servletResponse.getWriter().println("Response from Example09C");
    }

    @GetMapping("/example09D")
    public void example09D(OutputStream outputStream) throws IOException{
        outputStream.write("Response from example 09D".getBytes());
    }
}
