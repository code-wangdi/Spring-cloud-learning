package com.devil.serviceribbonfeign.service;

import com.devil.serviceribbonfeign.handler.HelloServiceErrorHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangdi
 * @date 2018/5/22
 */
@FeignClient(value = "eureka-client", fallback = HelloServiceErrorHandler.class)
public interface HelloService {

    @GetMapping("/hello")
    String hello();
}
