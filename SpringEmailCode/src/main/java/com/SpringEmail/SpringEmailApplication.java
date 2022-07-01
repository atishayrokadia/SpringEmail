package com.SpringEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {

	@Autowired
	private EmailSenderService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() {
		service.sendSimpleEmail("atishayrokadia2402@gmail.com","This is test mail","Mail Received Successfully");
	}

}
