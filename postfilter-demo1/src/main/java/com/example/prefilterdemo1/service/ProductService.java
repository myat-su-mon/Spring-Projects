package com.example.prefilterdemo1.service;

import com.example.prefilterdemo1.model.Product;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    //@PostFilter("filterObject.owner == authentication.principal.username")
    @PostFilter("filterObject.owner == authentication.name")
    public List<Product> findProducts(){
        List<Product> products=new ArrayList<>();
        products.add(new Product("beer","niko"));
        products.add(new Product("candy","niko"));
        products.add(new Product("chocolate","julien"));
        return products;
    }
}
