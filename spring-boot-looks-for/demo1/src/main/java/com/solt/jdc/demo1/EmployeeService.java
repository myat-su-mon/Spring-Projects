package com.solt.jdc.demo1;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void printEmail(){
        System.out.println("Fetching employees email.....");
        jdbcTemplate.queryForList("select email form employee", String.class)
        .forEach(System.out::println);
    }
}
