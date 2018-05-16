package yyl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderUploadApplication8004 {

	public static void main(String[] args) {
		SpringApplication.run(ProviderUploadApplication8004.class, args);
		System.out.println("(Startup success)");
	}
}