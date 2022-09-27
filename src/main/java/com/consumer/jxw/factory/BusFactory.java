package com.consumer.jxw.factory;

public class BusFactory extends VehicleFactory{

    @Override
    Vehicle create() {
        return new Bus();
    }
}
