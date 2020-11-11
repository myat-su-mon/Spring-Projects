package com.example.mockbean_mock.data.layer;

import com.example.mockbean_mock.ds.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FtpDataLayer {

    public List<Person> getData(){
        return List.of(
                new Person(1, "John"),
                new Person(2, "Dave"),
                new Person(3, "Peter")
        );
    }
}
