package com.example.mysqlapplication;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void printEmails(){
        System.out.println("Fetching emails...........");
        jdbcTemplate.queryForList("select email from employee", String.class).forEach(System.out::println);
    }
}
