package com.example.solid.dip.bad;

public class Switch {
    private LightBulb bulb = new LightBulb();

    public void operate() {
        bulb.turnOn();
    }
}
