package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Configuration
public class HelloWorldController {

	@GetMapping("/world")
	public String sayHello() {
		return "World!";
	}
}
