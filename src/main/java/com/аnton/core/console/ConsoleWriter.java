package com.аnton.core.console;

import java.util.ArrayList;

public class ConsoleWriter {
    public void write(String message) {
        System.out.print(message);
    }

    public void write(int message) {
        System.out.print(message);
    }

    public void write(double message) {
        System.out.print(message);
    }

    public void write(boolean message) {
        System.out.print(message);
    }

    public void writeTable(double start, double end, double step, ArrayList<Double> arr) {
        for(Double res: arr) {
            String output = String.format("start = %.3f\tend = %.3f\tf(x) = %.3f\n", start, end, res);
            start += step;
            write(output);
        }
    }
}
