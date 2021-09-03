package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.*"})
public class SpringApplicationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationDemoApplication.class, args);
	}

}
