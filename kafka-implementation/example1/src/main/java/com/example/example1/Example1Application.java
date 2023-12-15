package com.example.example1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Example1Application {

	public static void main(String[] args) {
		SpringApplication.run(Example1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			for(int i=0;i<=1000;i++) {
			kafkaTemplate.send("topic1", "hello guys : )" + i);
			}
		};
	}
}
