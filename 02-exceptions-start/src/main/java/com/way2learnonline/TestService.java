package com.way2learnonline;

public class TestService {
	
	public String getMessage(String message){
		
		if(true){
			throw new RuntimeException("Just for Testing!!");
		}
		return message;
		
		
	}

}
