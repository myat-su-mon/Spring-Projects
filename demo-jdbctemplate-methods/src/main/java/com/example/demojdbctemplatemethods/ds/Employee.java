package com.example.demojdbctemplatemethods.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Date;

@AllArgsConstructor
@Getter
@ToString
public class Employee {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private Date hire_date;
    private int salary;
}
