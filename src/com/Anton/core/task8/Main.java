package com.Anton.core.task8;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main(String[] args) {
        OutputHandler out = new OutputHandler();
        InputHandler in = new InputHandler();
        FunctionCounter func = new FunctionCounter();
        double x = in.inputDouble("X = ");
        out.output(func.countResult(x));
    }
}
