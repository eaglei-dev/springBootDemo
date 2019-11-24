package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SmsNotificationService implements INotificationService {

	@Override
	public String sendMessage() {
		return "Sending SMS";
	}

}
