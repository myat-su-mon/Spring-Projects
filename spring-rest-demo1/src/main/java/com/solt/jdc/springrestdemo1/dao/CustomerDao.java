package com.solt.jdc.springrestdemo1.dao;

import com.solt.jdc.springrestdemo1.ds.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Customer,Integer> {
}
