package com.devil.serviceribbon.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangdi
 * @date 2018/5/22
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hello() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello", String.class);
    }
}
