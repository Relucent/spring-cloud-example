package yyl.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yyl.springcloud.dao.HelloDao;
import yyl.springcloud.entity.Hello;

@Service
public class HelloService {

	@Autowired
	private HelloDao helloDao;

	public Hello getDefault() {
		return helloDao.getDefault();
	}

}
