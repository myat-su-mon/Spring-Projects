package com.solt.jdc.databaseproperties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DatabasePropertiesApplication implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    public DatabasePropertiesApplication(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabasePropertiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Fetching employees email");
        jdbcTemplate.queryForList("select email from employee", String.class)
                .forEach(System.out::println);
    }
}
