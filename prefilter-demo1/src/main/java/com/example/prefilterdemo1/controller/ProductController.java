package com.example.prefilterdemo1.controller;


import com.example.prefilterdemo1.model.Product;
import com.example.prefilterdemo1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    //curl -u niko:12345 http://localhost:8080/sell
    //curl -u julien:12345 http://localhost:8080/sell
    @GetMapping("/sell")
    public List<Product> sellProducts(){
        //mutable objects
       /* List<Product> products=new ArrayList<>();

        products.add(new Product("beer","niko"));
        products.add(new Product("candy","niko"));
        products.add(new Product("chocolate","julien"));

        */
        //immutable object
        List<Product> products=List.of(
                new Product("beer","niko"),
                new Product("candy","niko"),
                new Product("chocolate","julien")
        );


        return productService.sellProducts(products);
    }
}
