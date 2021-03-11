package com.tts.austindevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello Austin! Hope this works! I just added a workflow!";
    }

    @GetMapping("/")
    public String getIndex() {
        return "CI is working beautifully";
    }

}
