package com.technicalajeet.springbootformvalidation.controllers;

import com.technicalajeet.springbootformvalidation.entities.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/form")
    public String openForm(Model model) {
        model.addAttribute("loginData", new LoginData());//object used to th:object in the view after form action
        return "form";
    }

    //handler for process form data
    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result);
            return "form";
        }
        System.out.println(loginData);
        return "success";
    }
}
