package com.coen92.springboot.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class ApplicationIT {

    public static void main(String[] args) {
        SpringApplication.from(Application::main).with(ApplicationIT.class).run(args);
    }

}
