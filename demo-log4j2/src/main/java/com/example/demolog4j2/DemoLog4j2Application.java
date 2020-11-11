package com.example.demolog4j2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class DemoLog4j2Application implements CommandLineRunner {

    private Logger loggerA = Logger.getLogger("app.service.a");
    private Logger loggerB = Logger.getLogger("app.service.b");
    private Logger loggerC = Logger.getLogger("app.service.c");
    private Logger loggerD = Logger.getLogger("app.service.d");
    private Logger loggerE = Logger.getLogger("app.service.e");
    private Logger loggerF = Logger.getLogger("app.service.f");

    public static void main(String[] args) {
        SpringApplication.run(DemoLog4j2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        loggerA.log(Level.INFO, "Info Message from service A");
        loggerA.log(Level.WARNING, "Warning Messages from service A");
        loggerA.log(Level.FINEST, "Finest Message from service A");

        loggerB.log(Level.INFO, "Info Message from service B");
        loggerB.log(Level.WARNING, "Warning Messages from service B");
        loggerB.log(Level.FINEST, "Finest Message from service B");
    }
}
