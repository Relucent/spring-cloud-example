# Eureka

Eureka 是 Netflix开发的服务发现框架, 是一个基于 REST 的服务，主要在 AWS 云中使用, 定位服务来进行中间层服务器的负载均衡和故障转移。它提供了完整的服务注册(Service Registry)和服务发现(Service Discovery)的实现。Eureka也是SpringCloud体系中最核心的组件之一。  

  
Eureka由三个角色组成：
![Eureka基本架构](/__/svg/eureka-architecture-overview.png)
1. Eureka Server 注册中心
作为服务注册功能的服务器，提供服务注册和发现 
2. Service Provider 服务提供者    
将自身服务注册到Eureka，从而使服务消费方能够找到
3. Service Consumer 服务消费者   
从Eureka获取注册服务列表，从而能够消费服务  