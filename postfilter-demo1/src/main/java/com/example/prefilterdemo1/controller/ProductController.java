package com.example.prefilterdemo1.controller;


import com.example.prefilterdemo1.model.Product;
import com.example.prefilterdemo1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    //curl -u julien:12345 http://localhost:8080/find
    @GetMapping("/find")
    public List<Product> findProducts(){
        return productService.findProducts();
    }
}
