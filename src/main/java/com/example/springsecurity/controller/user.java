package com.example.springsecurity.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Avaruus Studios
 * @name user
 * @date 2022/8/23
 */
@RestController

public class user {

    @GetMapping(value = "/")
    public String hello(){
        return "Hello wo123123rld";
    }
    @GetMapping(value = "/users")
    public String hell2o(){
        return "Hello w123123123123123123123123orld";
    }
}
