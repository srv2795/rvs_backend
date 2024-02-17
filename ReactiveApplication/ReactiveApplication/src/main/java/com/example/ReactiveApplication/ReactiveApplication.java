package com.example.ReactiveApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.ConnectionFactoryOptionsBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

import java.util.Locale;
import java.util.TimeZone;

@EnableWebFlux
@EnableR2dbcRepositories
@SpringBootApplication
public class ReactiveApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
	}
}
