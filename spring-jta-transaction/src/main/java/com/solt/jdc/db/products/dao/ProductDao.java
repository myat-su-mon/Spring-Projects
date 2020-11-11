package com.solt.jdc.db.products.dao;

import com.solt.jdc.db.products.ds.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
