package com.example.solid.ocp.bad;

public class DiscountCalculator {

    public double calculate(String type, double price) {
        if ("STUDENT".equals(type)) {
            return price * 0.9;
        }
        if ("SENIOR".equals(type)) {
            return price * 0.8;
        }
        return price;
    }
}
