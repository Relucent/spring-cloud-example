package yyl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication8080 {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication8080.class, args);
		System.out.println("(Startup success)");
	}
}
