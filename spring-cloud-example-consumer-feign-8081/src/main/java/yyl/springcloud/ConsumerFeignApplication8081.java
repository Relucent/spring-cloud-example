package yyl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerFeignApplication8081 {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignApplication8081.class, args);
		System.out.println("(Startup success)");
	}
}
