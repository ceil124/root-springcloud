package com.zhengyf.eurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi() {
        String msg = "你好，现在的时间是：";
        return msg + helloService.getTime();
    }
}
