package com.solt.jdc.service;

import com.solt.jdc.db.employees.dao.EmployeeDao;
import com.solt.jdc.db.employees.ds.Employee;
import com.solt.jdc.db.products.dao.ProductDao;
import com.solt.jdc.db.products.ds.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Service
public class WareHouseService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private ProductDao productDao;

    @Transactional
    public void purgeData(){
        //employeeDao.deleteAll();
        productDao.deleteAll();
    }

    @Transactional
    public void saveData(){
        System.out.println("Saving employee 1 ..........");
        //employeeDao.save(new Employee(1, "John", "Doe", "johndoe@gmail.com", "55555", Date.valueOf("2020-02-02"), 5000));
        System.out.println("Saved employee 1 ............");

        System.out.println("Saving product 1 ..........");
        productDao.save(new Product(1, "Jet Ski", 20, 5000f, true));
        System.out.println("Saved product 1 ............");

        //throw new RuntimeException();
    }

    @Transactional
    public void listAllData(){
        System.out.println("Listing all employees.........");
        //employeeDao.findAll().forEach(System.out::println);

        System.out.println("Listing all products..........");
        productDao.findAll().forEach(System.out::println);
    }
}
