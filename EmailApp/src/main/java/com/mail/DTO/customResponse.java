package com.mail.DTO;

import org.springframework.http.HttpStatus;

public class customResponse {
    
	private String message;
	private HttpStatus httpRequest;
	private boolean status=false;
	
	
	public customResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public customResponse(String message, HttpStatus httpRequest, boolean status) {
		super();
		this.message = message;
		this.httpRequest = httpRequest;
		this.status = status;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public HttpStatus getHttpRequest() {
		return httpRequest;
	}


	public void setHttpRequest(HttpStatus httpRequest) {
		this.httpRequest = httpRequest;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
