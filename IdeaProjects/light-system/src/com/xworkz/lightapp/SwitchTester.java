package com.xworkz.lightapp;

import com.xworkz.lightapp.cflbulb.CflBulb;
import com.xworkz.lightapp.iSwitch.Switch;
import com.xworkz.lightapp.tubelight.TubeLight;

public class SwitchTester {
    public static void main(String[] args) {

        //Abstraction
        //interface type = class type;
        Switch aswitch = new TubeLight();
        aswitch.on();
        aswitch.off();

        Switch swi = new CflBulb();
        swi.on();
        swi.off();
    }
}
