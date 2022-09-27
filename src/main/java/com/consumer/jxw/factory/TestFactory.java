package com.consumer.jxw.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestFactory {

    @Autowired
    private Map<String, Vehicle> vehicleMap;


    public static void main(String[] args) {
        VehicleFactory cf = new CarFactory();
        Vehicle v = cf.create();
        System.out.println(v.color());
    }

    public String getColor(String vehicleType){
        Vehicle vehicle = vehicleMap.get(vehicleType);
        return vehicle.color();
    }
}
