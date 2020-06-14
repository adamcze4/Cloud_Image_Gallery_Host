package com.image.uploader.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        return "only for Users";
    }

    @GetMapping("/test2")
    public String test2() {
        return "only for Admins";
    }

    @GetMapping("/test3")
    public String test3() {
        return "everyone should be able to see it";
    }

}
