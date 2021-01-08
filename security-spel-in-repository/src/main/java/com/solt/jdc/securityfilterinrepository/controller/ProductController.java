package com.solt.jdc.securityfilterinrepository.controller;


import com.solt.jdc.securityfilterinrepository.entities.Product;
import com.solt.jdc.securityfilterinrepository.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    //curl -u niko:12345 http://localhost:8080/products/c
    //curl -u julien:12345 http://localhost:8080/products/c
    @GetMapping("/products/{text}")
    public List<Product> findProductsContaining(@PathVariable String text){
        return productRepository.findProductByNameContains(text);
    }
}
