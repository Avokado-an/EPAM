package com.аnton.core.service;

import com.аnton.core.entity.Dot;

public class CoordinatesService {
    private Double calculateSquaredDistanceToDot(Dot dot) {
        return Math.pow(dot.getX(), 2) * Math.pow(dot.getY(), 2);
    }

    private Double compareDistance(Dot dot1, Dot dot2) {
        return calculateSquaredDistanceToDot(dot1) - calculateSquaredDistanceToDot(dot2);
    }

    public int getComparedDistance(Dot dot1, Dot dot2) {
        double comparison = compareDistance(dot1, dot2);
        if(comparison < 0)
            return 1;
        else if(comparison > 0)
            return -1;
        return 0;
    }
}
