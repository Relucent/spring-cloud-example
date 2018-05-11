# config-server
https://github.com/spring-cloud/spring-cloud-config 

	/{application}/{profile}[/{label}]
	/{application}-{profile}.yml
	/{label}/{application}-{profile}.yml
	/{application}-{profile}.properties
	/{label}/{application}-{profile}.properties


	http://config9002.yyl:9002/application-dev.yml
	http://config9002.yyl:9002/application-test.yml
	
	http://config9002.yyl:9002/dev/application
