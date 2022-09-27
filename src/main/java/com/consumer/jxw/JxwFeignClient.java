package com.consumer.jxw;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "jxw-provider")
public interface JxwFeignClient {

    @GetMapping(value = "/config/get")
    String get();

}
