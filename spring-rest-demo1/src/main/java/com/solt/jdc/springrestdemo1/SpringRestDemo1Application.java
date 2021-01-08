package com.solt.jdc.springrestdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestDemo1Application {
    //curl -X GET -vs http://localhost:8080/customers | jq
    //curl -X GET -vs http://localhost:8080/customers/1 | jq
    //curl -X POST -v -H 'Content-Type: application/json' -d '{"code":"JD","firstName":"John","lastName":"Doe","address":"Love Lane North Bridge Road, PA 12345"}' http://localhost:8080/customers | jq
    //curl -X PUT -v -H 'Content-Type: application/json' -d '{"code":"JF","firstName":"John","lastName":"Freeman","address":"Love Lane North Bridge Road, PA 12345"}' http://localhost:8080/customers/6 | jq
    //curl -X DELETE -vs http://localhost:8080/customers/3
    //curl -X DELETE -vs http://localhost:8080/customers/800
    public static void main(String[] args) {
        SpringApplication.run(SpringRestDemo1Application.class, args);
    }

}
