package com.devil.serviceribbonfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangdi
 * @date 2018/5/22
 */
@FeignClient(value = "eureka-client")
public interface HelloService {

    @GetMapping("/hello")
    String hello();
}
