package com.narendra.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/test")
	public String testHelloCICDWorld() {
		return "Hello World !! Jenkins CICD pipeline on ec2 with ecr repo by Narendra";
	}
}
