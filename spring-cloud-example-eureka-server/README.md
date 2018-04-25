服务注册中心，Eureka Serve

http://localhost:8761


注意事项：  
在默认设置下，Eureka服务注册中心也会将自己作为客户端来尝试注册它自己，所以我们需要禁用它的客户端注册行为。    
```
eureka.client.register-with-eureka=false  
eureka.client.fetch-registry=false  
```
如果不禁止的话，会得到如下错误：
com.sun.jersey.api.client.ClientHandlerException: java.net.ConnectException: Connection refused: connect
这是因为注册中心将自己作为客户端注册的时候，发现在server上的端口被自己占据了。

如果要开启自动注册的话，可以启动两个server，互相注册  
server 1： eureka.client.serviceUrl.defaultZone=http://localhost:1112/eureka/  
server 2： eureka.client.serviceUrl.defaultZone=http://localhost:1111/eureka/  

  