@echo off  

start cmd /k  "java -jar X:/spring-cloud-example-eureka-7001.jar"
start cmd /k  "java -jar X:/spring-cloud-example-eureka-7002.jar"
start cmd /k  "java -jar X:/spring-cloud-example-eureka-7003.jar"

ping -n 5 127.1>nul  

start cmd /k  "java -jar X:/spring-cloud-example-provider-8001"
start cmd /k  "java -jar X:/spring-cloud-example-provider-8002"

start cmd /k  "java -jar X:/spring-cloud-example-consumer-8080"
