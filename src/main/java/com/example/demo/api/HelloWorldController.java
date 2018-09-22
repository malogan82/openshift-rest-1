package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openshift-rest")
public class HelloWorldController {
	
	@GetMapping(value="/hello-world")
	public String sayHelloWorld() {
		return "Hello World!";
	}
	
	@GetMapping(value="/hello")
	public String sayHello(String name) {
		return String.format("Hello %s!", name);
	}

}
