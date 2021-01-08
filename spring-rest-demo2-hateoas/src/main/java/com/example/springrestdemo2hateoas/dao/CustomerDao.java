package com.example.springrestdemo2hateoas.dao;

import com.example.springrestdemo2hateoas.ds.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Customer,Integer> {
}
