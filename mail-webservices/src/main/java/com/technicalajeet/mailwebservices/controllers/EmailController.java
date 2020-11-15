package com.technicalajeet.mailwebservices.controllers;

import com.technicalajeet.mailwebservices.models.EmailRequest;
import com.technicalajeet.mailwebservices.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/sendmail")
public class EmailController {

    @Autowired
    EmailService emailService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> sendMail(@RequestBody EmailRequest request) {
        emailService.sendMail(request.getMessage(), request.getSubject(), request.getTo());
        System.out.println(request);
        return ResponseEntity.ok("done");
    }
}
