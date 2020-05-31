package com.Anton.core.task10;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main(String[] args) {
        OutputHandler out = new OutputHandler();
        InputHandler in = new InputHandler();
        float a = in.inputFloat("a - ");
        float b = in.inputFloatWithMin((int) a, "b - ");
        float h = in.inputFloatWithMax(b - a, "h - ");
        TanFunction func = new TanFunction(a, b, h);
        for(String res: func.getResults())
            out.output(res);
    }
}
