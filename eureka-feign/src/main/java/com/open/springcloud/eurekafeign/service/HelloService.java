package com.open.springcloud.eurekafeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="eureka-client",fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping(value = "eureka_client_port",method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
