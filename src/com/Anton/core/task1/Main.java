package com.Anton.core.task1;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

class Main {
    public static void main(String[] args) {
        SquareCounter squareCounter = new SquareCounter();
        InputHandler in = new InputHandler();
        OutputHandler out = new OutputHandler();
        int number = in.inputIntWithMax(SquareCounter.MAX_VALUE, "Your number is ");
        out.output("Last digit of square: ");
        out.output(squareCounter.getLastSquareDigit(number));
        out.output("\nSquare: ");
        out.output(squareCounter.getSquare(number));
    }
}
