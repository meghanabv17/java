package com.xworkz.lightapp.tubelight;

import com.xworkz.lightapp.iSwitch.Switch;

public class TubeLight implements Switch {

    //Implementation class;
    @Override
    public void on() {
        System.out.println("Tubelight is turned on");
    }

    @Override
    public void off() {
        System.out.println("Tubelight is turned off");
    }
}
