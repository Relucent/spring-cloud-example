package yyl.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import yyl.springcloud.entity.Hello;

@RestController
public class HelloController {

	// private String REST_URL_PREFIX = "http://localhost:8001"; //#直连服务提供者
	private String REST_URL_PREFIX = "http://HELLO-PROVIDER"; // 按照微服务名称访问

	@Autowired
	private RestTemplate restTemplate;

	// ~ http://localhost:8080/hello
	@GetMapping("/hello")
	public Object hello() {
		ResponseEntity<Hello> response = restTemplate.getForEntity(REST_URL_PREFIX + "/hello", Hello.class);
		return response.getBody();
	}

}
