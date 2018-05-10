package yyl.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import yyl.springcloud.entity.Hello;

@RestController
public class HelloController {

	@GetMapping("/hello/{id}")
	@HystrixCommand(fallbackMethod = "processException")
	public Object hello(@PathVariable("id") Long id) {
		throw new RuntimeException("error");
	}

	public Object processException(@PathVariable("id") Long id) {
		Hello hello = new Hello();
		hello.setId(id);
		hello.setName("@Unknown");
		hello.setValue("@NonExistent");
		hello.setSource("~");
		return hello;
	}

}
