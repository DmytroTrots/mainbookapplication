package com.project.mainbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MainBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainBookApplication.class, args);
	}

}
