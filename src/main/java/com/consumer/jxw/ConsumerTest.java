package com.consumer.jxw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/con1")
@RefreshScope
public class ConsumerTest {

    @Autowired
    private JxwFeignClient jxwFeignClient;

    @Value(value = "${user.age: 10}")
    private String name;

    @Value(value = "${spring.application.name}")
    private String appName;


    @RequestMapping(value = "/get", method = GET)
    public String get2() {
        return "appName :" +appName +" name:"+name + " -- " + jxwFeignClient.get();
    }



    @RequestMapping(value = "/nginx", method = GET)
    public String getByNginx() {
        return "getByNginx :";
    }
}