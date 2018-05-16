# Zull


	http://localhost:8001/hello/1
	http://zull9000.yyl:9000/hello-provider/hello/1

	http://zull9000.yyl:9000/my-provider/hello/1


## hosts 文件位置  

	C:\Windows\System32\drivers\etc\hosts

	127.0.0.1 zull9000.yyl


### 上传文件注意事项  
需要在上传路径添加  /zuul 前缀( 可以使用zuul.servlet-path 自定义) 

### 网关的超时层级  

zuul  

	zuul:
	  max:
	    host:
	      connections: 500
	  host:
	    socket-timeout-millis: 60000
	    connect-timeout-millis: 60000

ribbon  

	ribbon:
	  ReadTimeout: 10000
	  ConnectTimeout: 10000
	  MaxAutoRetries: 0
	  MaxAutoRetriesNextServer: 1
	  eureka:
	    enabled: true

hystrix  

	hystrix:
	  command:
	    default:
	      execution:
	        timeout:
	          enabled: true
	        isolation:
	          thread:
	            timeoutInMilliseconds: 60000