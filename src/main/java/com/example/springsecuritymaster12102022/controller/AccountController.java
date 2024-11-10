package com.example.springsecuritymaster12102022.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/account")
    public String showAccountStatus(){
        return "account";
    }
}
