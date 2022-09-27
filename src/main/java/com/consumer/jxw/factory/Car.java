package com.consumer.jxw.factory;

import org.springframework.stereotype.Service;

@Service("CAR")
public class Car implements Vehicle{

    @Override
    public String color() {
        return "car read";
    }
}
