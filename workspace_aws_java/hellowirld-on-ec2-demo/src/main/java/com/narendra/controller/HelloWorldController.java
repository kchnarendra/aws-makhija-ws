package com.narendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/test")
	public String testHelloWorld() {
		return "Hello World !! by Narendra";
	}
}
