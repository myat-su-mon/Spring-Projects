package com.example.mockbean_mock;

import com.example.mockbean_mock.data.transfer.DataTransferAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MockbeanMockApplication implements CommandLineRunner {

    @Autowired
    private DataTransferAction dataTransferAction;

    public static void main(String[] args) {
        SpringApplication.run(MockbeanMockApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dataTransferAction.transfer();
    }
}
