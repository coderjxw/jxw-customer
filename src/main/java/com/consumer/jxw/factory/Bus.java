package com.consumer.jxw.factory;

import org.springframework.stereotype.Service;

@Service("BUS")
public class Bus implements Vehicle{

    @Override
    public String color() {
        return "bus blue";
    }
}
