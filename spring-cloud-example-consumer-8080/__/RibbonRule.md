## IRule选择

### RoundRobinRule
轮训(默认)

###  BestAvailableRule 
选择一个最小的并发请求的server

###  AvailabilityFilteringRule 
过滤掉那些因为一直连接失败的被标记为circuit tripped的后端server，并过滤掉那些高并发的server 

### ZoneAvoidanceRule 
复合判断server所在区域的性能和server的可用性选择server 

### RandomRule 
随机选择

### RetryRule 
对轮训的负载均衡策略机上重试机制

### WeightedResponseTimeRule 
根据响应时间分配一个权重，响应时间越长，权重越小，被选中的可能性越低

### ConsistentHashRule
hash一致性规则，如果http请求的header中存在一个key['rest_consistent_key']，则按它的value进行一致性hash选择相同的那个server，如果不存在，则使用服务启动时随机生成的一个字符串作为key

