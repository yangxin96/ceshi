package com.example.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 等风
 * @Date 2021/4/9 12:22
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class User {

    @GetMapping("/log")
    public String org(){
        return "githubceshi";
    }
}
