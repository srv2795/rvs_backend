package com.example.sso.SingleSignOnDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SingleSignOnDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleSignOnDemoApplication.class, args);
	}

}
