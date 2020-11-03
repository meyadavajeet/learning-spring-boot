package com.technicalajeet.thymeleafpractical.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
public class MyController {
    //http://localhost:8080/about
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        System.out.println("Inside about handler");
        model.addAttribute("name", "Ajeet Yadav");
        model.addAttribute("currentDate", new Date().toString());
        return "about";
    }

    //    loop iteration
    @GetMapping("/loop-example")
    public String iterators(Model model) {
        //send data
        List<String> siblings = List.of("Ajeet Yadav", "Kajal kumari", "Gulsan kumar", "Veena Kumari");
        model.addAttribute("siblings_names", siblings);
        return "loop-example";
    }

    //handler for condtional Statement
    @GetMapping("/cond")
    public String conHandler(Model model) {
        /*send data to view
        for elvis operator conditional statmenet
        */
        model.addAttribute("isActive", true);
        /*
        send data to view for if unless conditional statement
         */
        model.addAttribute("gender", 'F');
        /*
        send data to view for the switch case rendering
         */
        List<Integer> list = List.of(56, 784);
        model.addAttribute("mylist", list);
        return "cond-example";
    }

    //    handler for the thymeleaf include fragment
    @GetMapping("/services")
    public String serviceHandler(Model model) {
        return "services";
    }

    //handler for including fragment and pass dynamic value in it.
    @GetMapping("/aj")
    public String aj(Model model) {
        //processing logic
        model.addAttribute("title", "I like to eat samosa");
        model.addAttribute("subtitle", LocalDate.now().toString());
        return "aj";
    }

    //for new about
    @GetMapping("/newabout")
    public String newAbout() {
        return "aboutnew";
    }

    @GetMapping("/newservice")
    public String newservice() {
        return "servicenew";
    }
}
