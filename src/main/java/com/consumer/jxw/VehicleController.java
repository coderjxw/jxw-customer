package com.consumer.jxw;

import com.consumer.jxw.factory.TestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vehilce")
public class VehicleController {

    @Autowired
    private TestFactory testFactory;

    @GetMapping(value = "/getColor")
    public String getColorByType(@RequestParam("type") String type){
        return testFactory.getColor(type);
    }
}
