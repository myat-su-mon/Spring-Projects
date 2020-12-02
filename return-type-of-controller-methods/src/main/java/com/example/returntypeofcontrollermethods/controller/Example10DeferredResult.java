package com.example.returntypeofcontrollermethods.controller;

import com.example.returntypeofcontrollermethods.ds.Person;
import com.example.returntypeofcontrollermethods.utils.SleepUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

@Controller
public class Example10DeferredResult {

    @Autowired
    private TaskExecutor taskExecutor;
    private Logger logger = LoggerFactory.getLogger(Example10DeferredResult.class);

    // curl http://localhost:8080/example10A
    @GetMapping("/example10A")
    @ResponseBody
    public DeferredResult<Person> example10A(){
        DeferredResult<Person> deferredResult = new DeferredResult<>();

        taskExecutor.execute(()-> {
            logger.info(String.format("Sleeping for %d seconds before giving back result", SleepUtil.SLEEP_TIME_SECONDS));
            SleepUtil.sleep();
            logger.info("finished sleeping, giving back result..........");
            deferredResult.setErrorResult(new Person("John", "Doe"));
        });
        return deferredResult;
    }
}
