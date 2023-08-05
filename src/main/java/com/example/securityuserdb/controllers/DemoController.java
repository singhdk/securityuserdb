package com.example.securityuserdb.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        var user = SecurityContextHolder.getContext().getAuthentication();
        user.getAuthorities().forEach(a -> System.out.println(a));
        return "Demo";
    }
}
