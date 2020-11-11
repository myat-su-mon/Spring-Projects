package com.solt.jdc.springstartertest.dao;

import com.solt.jdc.springstartertest.ds.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends CrudRepository<City, Integer> {
}
