package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	@Value("${email.username}")
	String username;
	@Value("${email.password}")
	String password;
	@Value("${email.provider}")
	String provider;
	@Value("${email.port}")
	int port;
	
	
	public void sendMessage(){
		// return "Sending Notification.";
		System.out.println("Sending Message."+username);
	}

}
