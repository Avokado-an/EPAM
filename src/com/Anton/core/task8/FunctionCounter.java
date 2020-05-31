package com.Anton.core.task8;

class FunctionCounter {
    private double biggerXFunc(double x) {
        return 9 + 3 * x - x * x;
    }

    private double smallerXFunc(double x) {
        return 1. / (x*x*x - 6);
    }

    double countResult(double x) {
        if(x >= 3)
            return biggerXFunc(x);
        return smallerXFunc(x);
    }
}
