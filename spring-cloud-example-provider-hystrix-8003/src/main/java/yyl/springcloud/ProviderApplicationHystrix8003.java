package yyl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册进Eureka服务中
@EnableCircuitBreaker // 对 Hystrix 熔断机制的支持
public class ProviderApplicationHystrix8003 {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplicationHystrix8003.class, args);
		System.out.println("(Startup success)");
	}
}