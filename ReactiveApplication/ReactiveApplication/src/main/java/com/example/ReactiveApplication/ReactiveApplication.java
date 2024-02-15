package com.example.ReactiveApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
public class ReactiveApplication {
	public static void main(String[] args) {
		Locale.setDefault(Locale.getDefault());
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		SpringApplication.run(ReactiveApplication.class, args);
	}
}
