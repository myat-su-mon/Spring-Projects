package com.example.springrestdemo2hateoas.dao;

import com.example.springrestdemo2hateoas.ds.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends CrudRepository<Address,Integer> {
}
