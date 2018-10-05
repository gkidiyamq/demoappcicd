package com.abc.sample.demoappcicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @RequestMapping("/msg")
    public String getTextMessage(){
        return "Welcome to the Bank !!!!";
    }

}
