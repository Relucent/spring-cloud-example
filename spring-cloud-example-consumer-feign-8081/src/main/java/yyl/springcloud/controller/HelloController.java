package yyl.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import yyl.springcloud.service.HelloClientService;

@RestController
public class HelloController {

	@Autowired
	private HelloClientService helloClientService;

	// ~ http://localhost:8080/hello/1
	@GetMapping("/hello/{id}")
	public Object hello(@PathVariable("id") Long id) {
		return helloClientService.hello(id);
	}
}
