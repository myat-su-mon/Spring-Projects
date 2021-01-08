package com.example.methodpermissionsdemo.controller;

import com.example.methodpermissionsdemo.model.Document;
import com.example.methodpermissionsdemo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {
    @Autowired
    private DocumentService documentService;
    //curl -u natalie:12345 http://localhost:8080/documents/abc123
    //curl -u natalie:12345 http://localhost:8080/documents/asd555
    //curl -u emma:12345 http://localhost:8080/documents/asd555
    //curl -u emma:12345 http://localhost:8080/documents/abc123
    @GetMapping("/documents/{code}")
    public Document getDetails(@PathVariable String code){
        return documentService.getDocument(code);
    }
}
