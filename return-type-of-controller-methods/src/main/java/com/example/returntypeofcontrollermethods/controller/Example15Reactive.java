package com.example.returntypeofcontrollermethods.controller;

import com.example.returntypeofcontrollermethods.ds.Person;
import com.example.returntypeofcontrollermethods.utils.SleepUtil;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Example15Reactive {

    @Autowired
    private TaskExecutor taskExecutor;

    // curl http://localhost:8080/example15
    // curl -D - http://localhost:8080/example15
    @GetMapping("/example15")
    @ResponseBody
    public Observable<Person> example15(){
        PublishSubject<Person> subject = PublishSubject.create();

        taskExecutor.execute(()->{
            SleepUtil.sleep();
            subject.onNext(new Person("John", "William"));
            subject.onNext(new Person("John", "Doe"));

            subject.onComplete();
        });
        return subject;
    }
}
