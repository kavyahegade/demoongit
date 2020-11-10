package com.kh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitdemoApplication {
	
	@GetMapping("/eve")
	public String saybye() {
		return "everyone bye";
		
	}
	
	
	
	public String saywelcome() {
		return "Hello kavya";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

}
