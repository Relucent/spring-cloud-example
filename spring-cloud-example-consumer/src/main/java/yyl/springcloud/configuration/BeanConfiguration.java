package yyl.springcloud.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class BeanConfiguration {

	@Bean
	@LoadBalanced // 开启负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	// 负载均衡策略
	@Bean
	public IRule ribbonRule() {
		// return new RoundRobinRule();//轮询
		return new RetryRule();// 轮询 + 重试机制
	}

}
