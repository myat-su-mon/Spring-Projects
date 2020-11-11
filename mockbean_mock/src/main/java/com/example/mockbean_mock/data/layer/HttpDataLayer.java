package com.example.mockbean_mock.data.layer;

import com.example.mockbean_mock.ds.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HttpDataLayer {

    public void saveData(List<Person> persons) {
        System.out.println("Saving data to http............");
        persons.forEach(System.out::println);
        System.out.println("Done");
    }
}
