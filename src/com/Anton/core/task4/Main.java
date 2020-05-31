package com.Anton.core.task4;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main(String[] args) {
        OutputHandler out = new OutputHandler();
        InputHandler in = new InputHandler();
        NumbersChecker checker = new NumbersChecker();
        for(int i = 0; i < 4; i++)
            checker.addElement(in.inputInt("Input element number " + (i + 1) + " "));
        out.output(checker.findEven().toString());
    }
}
