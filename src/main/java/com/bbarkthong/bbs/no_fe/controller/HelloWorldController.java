package com.bbarkthong.bbs.no_fe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/hello")
    public String helloString() {
        return "hello world!";
    }
}
