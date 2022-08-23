package com.example.BeanCycle;

import org.apache.log4j.BasicConfigurator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanCycleApplication {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        SpringApplication.run(BeanCycleApplication.class, args);
    }


}
