package yyl.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import yyl.springcloud.entity.Hello;

@FeignClient(value = "HELLO-PROVIDER")
public interface HelloClientService {

	@GetMapping("/hello/{id}")
	Hello hello(@PathVariable("id") long id);

}
