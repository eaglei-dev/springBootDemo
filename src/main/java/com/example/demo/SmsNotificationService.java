package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService implements INotificationService {

	@Override
	public String sendMessage(EmailUser user) {
		return "Sending SMS from "+user.toString();
	}

}
