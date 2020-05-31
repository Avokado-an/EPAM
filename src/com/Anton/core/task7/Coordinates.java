package com.Anton.core.task7;

class Coordinates implements Comparable<Coordinates>{
    private int x;
    private int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinates o) {
        return (x * x + y * y) - (o.x * o.x + o.y + o.y);
    }
}
