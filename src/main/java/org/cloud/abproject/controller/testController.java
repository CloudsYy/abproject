package org.cloud.abproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class testController {

    @GetMapping("/hello")
    public String test(){
        return "hello world";
    }
}
