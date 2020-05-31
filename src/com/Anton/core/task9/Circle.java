package com.Anton.core.task9;

class Circle {
    private double radius;
    private static final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    double getLength() {
        return 2 * PI * radius;
    }

    double getArea() {
        return PI * radius * radius;
    }
}
