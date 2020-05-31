package com.Anton.core.task5;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main(String[] args) {
        OutputHandler out = new OutputHandler();
        InputHandler in = new InputHandler();
        int number = in.inputIntWithMin(0, "Number to check - ");
        PerfectNumberChecker checker = new PerfectNumberChecker(number);
        out.output(checker.isPerfect().toString());
    }
}
