package com.devil.serviceribbonfeign.handler;

import com.devil.serviceribbonfeign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author wangdi
 * @date 2018/5/24
 */
@Component
public class HelloServiceErrorHandler implements HelloService {
    @Override
    public String hello() {
        return "error";
    }
}
