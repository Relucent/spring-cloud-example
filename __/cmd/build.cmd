@echo on

cd /d D:\workspace\spring-cloud-example
start mvn clean package  

pause  
echo continue pause  

copy D:\workspace\spring-cloud-example\spring-cloud-example-eureka-7001\target\spring-cloud-example-eureka-7001.jar X:\
copy D:\workspace\spring-cloud-example\spring-cloud-example-eureka-7002\target\spring-cloud-example-eureka-7003.jar X:\
copy D:\workspace\spring-cloud-example\spring-cloud-example-eureka-7002\target\spring-cloud-example-eureka-7003.jar X:\

copy D:\workspace\spring-cloud-example\spring-cloud-example-provider-8001\target\spring-cloud-example-provider-8001.jar X:\
copy D:\workspace\spring-cloud-example\spring-cloud-example-provider-8002\target\spring-cloud-example-provider-8002.jar X:\

copy D:\workspace\spring-cloud-example\spring-cloud-example-consumer-8080\target\spring-cloud-example-consumer-8080.jar X:\

pause  
echo continue pause  