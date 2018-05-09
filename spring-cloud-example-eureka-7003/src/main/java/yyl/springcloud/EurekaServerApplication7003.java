package yyl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication7003 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication7003.class, args);
		System.out.println("(Startup success)");
	}
}