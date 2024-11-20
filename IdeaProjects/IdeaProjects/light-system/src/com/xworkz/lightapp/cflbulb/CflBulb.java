package com.xworkz.lightapp.cflbulb;

import com.xworkz.lightapp.iSwitch.Switch;
import com.xworkz.lightapp.tubelight.TubeLight;

public class CflBulb implements Switch {

    //Implementation class;
    @Override
    public void on() {
        System.out.println("Getting a light...");
    }

    @Override
    public void off() {
        System.out.println("Not getting a light...!!!");
    }
}
