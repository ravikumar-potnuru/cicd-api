package com.aws.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hi")
	public String getName() {
		return "<h3>Hello Tomcat Server</h3>";
	}
}
