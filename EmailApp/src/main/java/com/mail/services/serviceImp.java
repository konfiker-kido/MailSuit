package com.mail.services;

import java.io.File;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

//import ch.qos.logback.classic.Logger;

@Service
public class serviceImp implements services {

	@Autowired
	JavaMailSender mailSender;


	@Override
	public void sendMail(String to, String subject, String message) {

		SimpleMailMessage sms = new SimpleMailMessage();
		sms.setTo(to);
		sms.setSubject(subject);
		sms.setText(message);
        sms.setFrom("akash99.official@gmail.com"); 
		mailSender.send(sms);
//		logger.info("Email has been Sent..");

	}

	@Override
	public void sendMail(String[] to, String subject, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendEmailWithHtml(String to, String subject, String htmlContent) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");      
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(htmlContent, true); // Set HTML content 

            // Set the sender's email address
            helper.setFrom("akash99.official@gmail.com");  

            // Send the email
            mailSender.send(message); 

            System.out.println("HTML email sent successfully.");
        } catch (Exception e) {
            System.err.println("Error sending HTML email: " + e.getMessage());
        }
    }

	@Override
	public void sendEmailWithFile(String to, String subject,String message, File file) {
		// TODO Auto-generated method stub
		
		 try {
	            MimeMessage mimemessage = mailSender.createMimeMessage();
	            MimeMessageHelper helper = new MimeMessageHelper(mimemessage, true);         
	            helper.setTo(to);
	            helper.setSubject(subject);
	            helper.setText(message); // Set HTML content 

	            //  
	            FileSystemResource fileSys=new  FileSystemResource(file);
	            helper.addAttachment(fileSys.getFilename(), file); 
	            
	            // Set the sender's email address
	            helper.setFrom("akash99.official@gmail.com");  

	            // Send the email
	            mailSender.send(mimemessage);  

	            System.out.println("HTML email sent successfully.");
	        } catch (Exception e) {
	            System.err.println("Error sending HTML email: " + e.getMessage());
	        }

	}

}
