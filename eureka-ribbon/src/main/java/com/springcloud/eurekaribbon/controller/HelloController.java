package com.springcloud.eurekaribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springcloud.eurekaribbon.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;



    @RequestMapping("/hi")
    public String getHi(@RequestParam String name){
       return helloService.hiServie(name);
    }


}
