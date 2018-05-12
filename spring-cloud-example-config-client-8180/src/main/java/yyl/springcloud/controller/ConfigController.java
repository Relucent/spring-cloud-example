package yyl.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {


	@Value("${spring.application.name}")
	private String applicationName;
	
	
	// ~ http://localhost:8180/
	// ~ http://localhost:8280/
	@GetMapping("/")
	public Object index() {
		return applicationName;
	}

}
