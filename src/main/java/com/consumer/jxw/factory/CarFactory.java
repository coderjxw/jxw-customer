package com.consumer.jxw.factory;

public class CarFactory extends VehicleFactory{
    @Override
    Vehicle create() {
        return new Car();
    }
}
