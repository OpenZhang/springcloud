package com.springcloud.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiServie(String name){
        return restTemplate.getForObject("http://eureka-client/eureka_client_port?name="+name,String.class);
    }
}
