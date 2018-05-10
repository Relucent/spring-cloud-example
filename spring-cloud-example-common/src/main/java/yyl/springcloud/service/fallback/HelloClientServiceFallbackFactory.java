package yyl.springcloud.service.fallback;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
import yyl.springcloud.entity.Hello;
import yyl.springcloud.service.HelloClientService;

@Component
public class HelloClientServiceFallbackFactory implements FallbackFactory<HelloClientService> {

	@Override
	public HelloClientService create(Throwable throwable) {
		return new HelloClientService() {
			@Override
			public Hello hello(Long id) {
				Hello hello = new Hello();
				hello.setId(id);
				hello.setName("~");
				hello.setValue("#Service Suspended"); 
				hello.setSource("@Fallback");
				return hello;
			}
		};
	}
}
