package yyl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication9002 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication9002.class, args);
		System.out.println("(Startup success)");
	}
}