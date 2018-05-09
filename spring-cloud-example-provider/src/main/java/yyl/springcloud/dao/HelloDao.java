package yyl.springcloud.dao;

import org.springframework.stereotype.Repository;

import yyl.springcloud.entity.Hello;

@Repository
public class HelloDao {

	public Hello getDefault() {
		Hello hello = new Hello();
		hello.setId(1L);
		hello.setName("hello");
		hello.setValue("world");
		return hello;
	}

}
