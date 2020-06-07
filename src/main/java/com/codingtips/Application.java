package com.codingtips;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("hello world");
	}

	@Bean
	CommandLineRunner cmdRunner() {
		return args -> System.out.println("cmdrunner::run() mehthod");
	}

	@Bean
	ApplicationRunner appRunner() {
		return args -> System.out.println("apprunner:run() method");
	}
	
}
