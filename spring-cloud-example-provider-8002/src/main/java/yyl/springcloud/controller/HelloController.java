package yyl.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import yyl.springcloud.entity.Hello;
import yyl.springcloud.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/hello")
	public Object hello() {
		Hello hello = helloService.getDefault();
		return hello;
	}

}
