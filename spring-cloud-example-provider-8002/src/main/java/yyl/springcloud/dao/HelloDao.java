package yyl.springcloud.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import yyl.springcloud.entity.Hello;

@Repository
public class HelloDao {

	
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	public Hello getDefault() {
		Hello hello = new Hello();
		hello.setId(1L);
		hello.setName("hello");
		hello.setValue("world");
		hello.setSource(instanceId);
		return hello;
	}

}
