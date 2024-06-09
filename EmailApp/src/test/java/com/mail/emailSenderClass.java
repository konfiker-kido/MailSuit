package com.mail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.mail.services.services;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = {
	    "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
	})
//@SpringBootTest
public class emailSenderClass { 

	@Autowired
	services mailService;
	
	@Test
	void emailSendTest() {
		mailService.sendMail("1999aakashmaurya@gmail.com", "Testing mails", "This mail is coming from the backend while creating the mail application");
	}
}
