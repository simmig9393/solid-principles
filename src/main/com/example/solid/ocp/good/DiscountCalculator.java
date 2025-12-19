package com.example.solid.ocp.good;

public class DiscountCalculator {
    public double calculate(Discount discount, double price) {
        return discount.apply(price);
    }
}
