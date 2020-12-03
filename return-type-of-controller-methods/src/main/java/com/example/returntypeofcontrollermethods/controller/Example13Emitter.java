package com.example.returntypeofcontrollermethods.controller;

import com.example.returntypeofcontrollermethods.ds.Person;
import com.example.returntypeofcontrollermethods.utils.SleepUtil;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import java.util.concurrent.CompletableFuture;

@Controller
public class Example13Emitter {

    @Autowired
    private TaskExecutor taskExecutor;

    @GetMapping("/example13A")
    @ResponseBody
    public ResponseBodyEmitter example13A(){
        ResponseBodyEmitter emitter = new ResponseBodyEmitter();

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(()->{
            SleepUtil.sleep();
            send(emitter, new Person("John", "Doe"), MediaType.APPLICATION_JSON);
        })
    }

    @SneakyThrows
    private void send(ResponseBodyEmitter emitter, Object object, MediaType mediaType) {
        emitter.send(object, mediaType);
    }
}
