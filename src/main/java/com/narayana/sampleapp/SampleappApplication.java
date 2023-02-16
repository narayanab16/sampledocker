package com.narayana.sampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class SampleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleappApplication.class, args);
	}
	
	@GetMapping(value="/")
        public String home() {
	   return "This is home page";
        }

}
