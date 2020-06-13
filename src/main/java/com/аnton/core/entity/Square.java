package com.аnton.core.entity;

public class Square {
    private Double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public Double getSideLength() {
        return sideLength;
    }

    public void setSideLength(Double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Square))
            return false;
        Square square = (Square) o;
        return getSideLength().equals(square.getSideLength());
    }

    @Override
    public int hashCode() {
        return sideLength.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Square: side length = %.3f", sideLength);
    }
}
