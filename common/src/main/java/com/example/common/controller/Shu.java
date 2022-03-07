package com.example.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * yang
 * 2022/3/7
 * 4:45 PM
 **/

@RequestMapping("/hai/")
@RestController
public class Shu {

    @GetMapping("he")
    public String he(){
        return "简单的测试";
    }


    @GetMapping("ce")
    public String ceshi(){
        return "第二次测试";
    }

    @GetMapping("shi")
    public String ce(){
        return "第三次测试";
    }
}
