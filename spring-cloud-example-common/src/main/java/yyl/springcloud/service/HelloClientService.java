package yyl.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import yyl.springcloud.entity.Hello;
import yyl.springcloud.service.fallback.HelloClientServiceFallbackFactory;

@FeignClient(value = "HELLO-PROVIDER",fallbackFactory=HelloClientServiceFallbackFactory.class)
public interface HelloClientService {

	@GetMapping("/hello/{id}")
	Hello hello(@PathVariable("id") Long id);

}
