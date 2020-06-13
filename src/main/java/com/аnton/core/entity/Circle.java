package com.аnton.core.entity;

public class Circle {
    private Double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Circle))
            return false;
        Circle circle = (Circle) o;
        return circle.getRadius().equals(getRadius());
    }

    @Override
    public int hashCode() {
        return radius.hashCode();
    }


    @Override
    public String toString() {
        return String.format("Circle of %.2f radius", radius);
    }
}
