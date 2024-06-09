package com.mail.services;

import java.io.File;

public interface services { 

	  // sending to single person
	   void sendMail(String to,String subject,String message);
	   
	   //sending to multiple person
	   
	   void sendMail(String []to,String subject,String message);
	   
	   // sending a html content
	   void sendEmailWithHtml(String to, String subject,String message);
	   
	   // sending a file
	   void sendEmailWithFile(String to, String subject,String message,File file); 
	   
}
