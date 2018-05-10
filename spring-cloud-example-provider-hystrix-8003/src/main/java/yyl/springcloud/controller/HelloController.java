package yyl.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import yyl.springcloud.entity.Hello;
import yyl.springcloud.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/hello/{id}")
	@HystrixCommand(fallbackMethod = "processException")
	public Object hello(@PathVariable("id") Long id) {
		if (id.intValue() == 0) {
			throw new RuntimeException("error");
		}
		Hello hello = helloService.getDefault();
		hello.setId(id);
		return hello;
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
