package com.devops.jenkins.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/jenkins")
    public String test() {
        return "LEARNING JENKINS";
    }

    @GetMapping("/test/github")
    public String github() {
        return "LEARNING GITHUB ACTIONS";
    }
}
