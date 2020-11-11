package com.example.demo.ds;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@ToString
public class Employee {
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private Date hire_date;
    private int salary;
}
