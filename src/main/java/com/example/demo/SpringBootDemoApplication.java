package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {
	@Bean
	public EmailUser getHrAdmin(){
		return new EmailUser("hrAdmin", "hrPassword");
	}
	
	@Bean
	public EmailUser getMgrAdmin(){
		return new EmailUser("mgrAdmin", "mgrPassword");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
		
		String[] names = ctx.getBeanDefinitionNames();
		Arrays.sort(names);
		for(String name:names) {
			System.out.println(name);
		}
		
	}

}
