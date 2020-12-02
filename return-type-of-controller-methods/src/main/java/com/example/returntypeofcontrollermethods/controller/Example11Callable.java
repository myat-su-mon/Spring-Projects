package com.example.returntypeofcontrollermethods.controller;

import com.example.returntypeofcontrollermethods.ds.Person;
import com.example.returntypeofcontrollermethods.utils.SleepUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;

@Controller
public class Example11Callable {

    private Logger logger = LoggerFactory.getLogger(Example11Callable.class);

    // curl http://localhost:8080/example11A
    @GetMapping("/example11A")
    @ResponseBody
    public Callable<Person> example11A(){
        return () -> {
            logger.info(String.format("Sleeping for %d seconds before giving back result", SleepUtil.SLEEP_TIME_SECONDS));
            SleepUtil.sleep();
            logger.info("finished sleeping, giving back result..........");
            return new Person("John", "Doe");
        };
    }
}
