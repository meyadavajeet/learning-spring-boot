package com.technicalajeet.mailwebservices.services;

import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class EmailService {
    public boolean sendMail(String message, String subject, String to) {
        boolean flag = false;
        //receiver email address
        String from = "ay26528974@gmail.com";
        //rest of the code
        //Variable for gmail
        String host = "smtp.gmail.com";
        //get the system properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES ::" + properties);
        //setting important information to properties object
        //host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        //Step 1: to get the session object..
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("ay26528974@gmail.com", "Ay@26528974@");
            }
        });
        session.setDebug(true);
        //Step 2 : compose the message [text,multi media]
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            //from email
            mimeMessage.setFrom(from);
            //adding recipient to message
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //adding subject to message
            mimeMessage.setSubject(subject);
            //adding text to message
            mimeMessage.setText(message);
            //send
            //Step 3 : send the message using Transport class
            Transport.send(mimeMessage);
            flag = true;
            System.out.println("Sent success...................");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag = true;
    }
}
