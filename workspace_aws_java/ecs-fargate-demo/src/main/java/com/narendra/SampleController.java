package com.narendra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/test")
	public String test() {
		System.out.println("SmpleController test() ");
		return "This response is from springboot sample app";
	}
}
