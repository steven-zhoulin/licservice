package com.study.springcloud.licservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${app.name}")
    private String appName;

    @Value("${app.env}")
    private String appEnv;

    @GetMapping("/hello")
    public void hello() {
        System.out.println("app.name: " + appName);
        System.out.println("app.env: " + appEnv);
    }

}
