package com.аnton.core.service;

public class SquareService {
    public Double calculateSideFromDiagonal(double diagonal) {
        return diagonal / Math.sqrt(2);
    }

    public Double calculateArea(double sideLength) {
        return Math.pow(sideLength, 2);
    }
}
