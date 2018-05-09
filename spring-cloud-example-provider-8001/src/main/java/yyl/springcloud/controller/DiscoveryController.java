package yyl.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/discovery")
	public Object discovery() {
		List<String> result = new ArrayList<>();
		for (String service : discoveryClient.getServices()) {
			for (ServiceInstance srv : discoveryClient.getInstances(service)) {
				result.add(srv.getServiceId() + " " + srv.getUri());
			}
		}
		return result;
	}

}
