package com.solt.jdc.saltingdemo.dao;

import com.solt.jdc.saltingdemo.ds.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customer, Integer> {
}
