package com.consumer.jxw.observer;


import org.springframework.stereotype.Component;

import java.util.Observable;
import java.util.Observer;

@Component
public class MyObserver implements Observer {
    private String name;
    @Override
    public void update(Observable o, Object arg) {

    }
}
