package com.example.helloworld.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jh.peng on 2019/10/22.
 */
@RestController
@RequestMapping("hello")
public class HelloWorldWeb {

    @RequestMapping("/world")
    public String index() {
        return "HELLO WORLD";
    }
}
