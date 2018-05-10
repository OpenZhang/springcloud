package com.open.springcloud.eurekafeign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {
        return "sorry....."+name;
    }
}
