package com.bingo.hearthunter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //same as @Configuration @EnableAutoConfiguration @ComponentScan
public class HearthunterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HearthunterApplication.class, args);
	}
}
