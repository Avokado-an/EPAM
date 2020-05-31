package com.Anton.core.task3;

class AreaCalculator {
    private double sideLength;
    private final double PI = 3.14;

    AreaCalculator(double sideLength) {
        this.sideLength = sideLength;
    }

    Double getBiggerSquareArea() {
        return sideLength * sideLength;
    }

    Double getCircleArea() {
        return PI * (sideLength / 2) * (sideLength / 2);
    }

    Double getSmallerSquareArea() {
        return getBiggerSquareArea() / 2;
    }
}
