package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.NotificationService;
@RestController
public class AppController {
	@Autowired
	NotificationService ns;
	
	@GetMapping("/greet")
	public String greetUser() {
		return "Hello World";
	}
	
	@GetMapping("/getMessage")
	public void getMessage() {
		ns.sendMessage();
	}

}
