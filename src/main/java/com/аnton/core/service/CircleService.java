package com.аnton.core.service;

public class CircleService {
    private static final double PI = 3.14;

    public Double calculateLength(double radius) {
        return radius * PI * 2;
    }

    public Double calculateArea(double radius) {
        return radius * radius * PI;
    }
}
