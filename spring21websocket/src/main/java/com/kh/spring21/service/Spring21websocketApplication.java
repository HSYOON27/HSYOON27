package com.kh.spring21.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Spring21websocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring21websocketApplication.class, args);
	}

}
