package com.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmailAppApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(EmailAppApplication.class, args);
	}
 
}
  