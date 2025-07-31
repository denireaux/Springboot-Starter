package com.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class StarterApplication {

	@RequestMapping("/")
	public String home() {
		return "Susan Bai is a Message Bus.";
	}

	@RequestMapping("susan")
	public String requestMethodName(@RequestParam String param) {
		return "LITERAL BUS";
	}
	
	

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

}
