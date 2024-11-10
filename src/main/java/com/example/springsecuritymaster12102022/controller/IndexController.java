package com.example.springsecuritymaster12102022.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({"/","/home"})
    public String index(){
        return "home";
    }
}
