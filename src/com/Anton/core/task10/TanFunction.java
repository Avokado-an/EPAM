package com.Anton.core.task10;

import java.util.ArrayList;

class TanFunction {
    private float a;
    private float b;
    private float h;

    TanFunction(float a, float b, float h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    private double count() {
        return Math.tan(a);
    }

    private String getResult() {
        String res = "";
        res += String.format("a - %.3f", a);
        res += String.format("\tb - %.3f", b);
        res += String.format("\tres - %.3f\n", count());
        return res;
    }

    ArrayList<String> getResults() {
        ArrayList<String> res = new ArrayList<>();
        for(; a < b; a += h) {
            res.add(getResult());
        }
        return res;
    }
}
