package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppController {
	@Autowired
	@Qualifier("smsNotificationService") // @Qualifier("/beanName")
	INotificationService ns;
	
	@GetMapping("/greet")
	public String greetUser() {
		return "Hello World";
	}
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return ns.sendMessage();
	}

}
