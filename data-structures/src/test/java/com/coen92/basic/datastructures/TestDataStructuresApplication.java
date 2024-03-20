package com.coen92.basic.datastructures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDataStructuresApplication {

    public static void main(String[] args) {
        SpringApplication.from(Application::main).with(TestDataStructuresApplication.class).run(args);
    }

}
