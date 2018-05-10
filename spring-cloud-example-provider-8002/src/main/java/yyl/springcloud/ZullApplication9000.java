package yyl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZullApplication9000 {

	public static void main(String[] args) {
		SpringApplication.run(ZullApplication9000.class, args);
		System.out.println("(Startup success)");
	}
}