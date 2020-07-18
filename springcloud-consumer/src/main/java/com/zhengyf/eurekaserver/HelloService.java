package com.zhengyf.eurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String getTime() {
        return restTemplate.getForObject("http://SPRINGCLOUD-PROVIDER/getTime",String.class);
    }


}
