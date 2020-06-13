package com.аnton.core.entity;

public class Dot {
    private Double x;
    private Double y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Dot))
            return false;
        Dot dot = (Dot) o;
        return x.equals(dot.x) && y.equals(dot.y);
    }

    @Override
    public int hashCode() {
        return x.hashCode() + y.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Dot (%.2f ; %.2f)", x, y);
    }

}
