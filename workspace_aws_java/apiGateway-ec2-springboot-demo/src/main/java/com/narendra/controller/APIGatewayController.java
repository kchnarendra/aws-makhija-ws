package com.narendra.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class APIGatewayController {

	@GetMapping("/get")
	public String test() {
		return "Get Method invoked";
	}

	@PostMapping("/post")
	public Map<String, String> post(@RequestBody Map<String, String> map) {
		return map;
	}

}