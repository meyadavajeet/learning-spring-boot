package com.solvewithajeet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public  String index(){
        System.out.println("this is the home page");
        return "index";
    }
    @RequestMapping("/contact")
    public  String contact(){
        System.out.println("contact page rendered");
        return "contact";
    }
}
