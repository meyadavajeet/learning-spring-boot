package com.solvewithajeet.smallwebapp;

import com.solvewithajeet.smallwebapp.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @Autowired
    UserRepository userRepository ;

    @RequestMapping("/")
    public String index() {
        return "Hello Ajeet sir";
    }

    @RequestMapping("/regform")
    public String register() {
        return "registration";
    }
// first method to print field value in console using getName()
//    @RequestMapping("/view-details")
//    public String viewDetails(Registration reg){
//        System.out.println("I am working "+reg.getName());
//        return "view-details";
//    }


//    second way of getting all value of form and print in another page using ModelAndView
//    @RequestMapping("/view-details")
//    public ModelAndView viewDetails(Registration reg){
//        ModelAndView mv = new ModelAndView("view-details");
//        mv.addObject("regObject", reg);
//        return mv;
//    }

    //    third way using ModelMap
//    @RequestMapping("/view-details")
//    public ModelAndView viewDetails(Registration reg) {
//        ModelMap model = new ModelMap();
//        model.addAttribute("name" , reg.getName());
//        model.addAttribute("email", reg.getEmail());
//        model.addAttribute("password", reg.getPassword());
//        model.addAttribute("gender",reg.getGender() == Integer.parseInt("1")? "Male" : "female");
//        model.addAttribute("hobby",reg.getHobby());
//
//        ModelAndView mv = new ModelAndView("view-details");
//        mv.addObject("regObject", model);
//        return mv;
//    }


}

