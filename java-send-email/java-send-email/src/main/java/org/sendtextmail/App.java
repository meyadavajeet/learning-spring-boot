package org.sendtextmail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("preparing to send message ...");
        String message = "Hello , Dear, this is message for security check . ";
        String subject = "CodersArea : Confirmation";
        String to = "ajeet.hubrootsolutions@gmail.com";
        String from = "ay26528974@gmail.com";
        //calling static sendEmail method
        sendEmail(message, subject, to, from);

        sendAttachment(message, subject, to, from);
    }

    //this is responsible to send the message with attachment
    private static void sendAttachment(String message, String subject, String to, String from) {
        //Variable for gmail
        String host = "smtp.gmail.com";
        //get the system properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES " + properties);
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
        MimeMessage m = new MimeMessage(session);
        try {
            //from email
            m.setFrom(from);
            //adding recipient to message
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //adding subject to message
            m.setSubject(subject);
            //attachement..
            //file path
            String path = "C:\\Users\\HP\\Pictures\\Ajeet Yadav Reciept\\aj.jpg";
            MimeMultipart mimeMultipart = new MimeMultipart();
            //text
            MimeBodyPart textMime = new MimeBodyPart();
            //file
            MimeBodyPart fileMime = new MimeBodyPart();
            try {
                textMime.setText(message);
                File file = new File(path);
                fileMime.attachFile(file);
                mimeMultipart.addBodyPart(textMime);
                mimeMultipart.addBodyPart(fileMime);
            } catch (Exception e) {
                e.printStackTrace();
            }
            m.setContent(mimeMultipart);
            //send
            //Step 3 : send the message using Transport class
            Transport.send(m);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Sent success With Attachment Happy coding ...................");
    }


    //    this is responsible for send email
    private static void sendEmail(String message, String subject, String to, String from) {
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
        MimeMessage m = new MimeMessage(session);
        try {
            //from email
            m.setFrom(from);
            //adding recipient to message
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //adding subject to message
            m.setSubject(subject);
            //adding text to message
            m.setText(message);
            //send
            //Step 3 : send the message using Transport class
            Transport.send(m);
            System.out.println("Sent success...................");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
