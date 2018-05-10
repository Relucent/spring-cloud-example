package yyl.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import yyl.springcloud.entity.Hello;
import yyl.springcloud.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/hello/{id}")
	public Object hello(@PathVariable("id") Long id) {
		Hello hello = helloService.getDefault();
		hello.setId(id);
		return hello;
	}

}
