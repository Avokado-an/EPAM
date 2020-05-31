package com.Anton.core.task6;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main(String[] args) {
        InputHandler in = new InputHandler();
        OutputHandler out = new OutputHandler();
        int seconds = in.inputIntInRange(0, SecondsCounter.MAX_SECONDS, "Amount of seconds - ");
        SecondsCounter counter = new SecondsCounter(seconds);
        out.output(counter.getTime());
    }
}
