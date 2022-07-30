package com.example.firstapp.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FirstappApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FirstappApplication.class, args);
	}

}
