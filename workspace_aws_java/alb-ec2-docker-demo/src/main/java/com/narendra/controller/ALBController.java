package com.narendra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.util.EC2MetadataUtils;

@RestController
public class ALBController {

	@GetMapping("/health")
	public String health() {
		return "Success";
	}

	@GetMapping("/test")
	public String test() {
		return "Test invoked" + EC2MetadataUtils.getInstanceInfo().getPrivateIp();

	}
	
}