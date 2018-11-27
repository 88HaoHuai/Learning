package com.imooc.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huaihao on 2018/11/27.
 */
@RestController
public class HelloWorldCOntroller {

    @GetMapping("")
    public String index(){
        return "Hello,World!";
    }
}
