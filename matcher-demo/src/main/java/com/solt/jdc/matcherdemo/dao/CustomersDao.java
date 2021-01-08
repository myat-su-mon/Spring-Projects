package com.solt.jdc.matcherdemo.dao;


import com.solt.jdc.matcherdemo.ds.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
