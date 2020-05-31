package com.Anton.core.task3;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main(String[] args) {
        InputHandler in = new InputHandler();
        OutputHandler out = new OutputHandler();
        double sideLength = in.inputDoubleWithMin(0, "Side length of bigger square: ");
        AreaCalculator calculator = new AreaCalculator(sideLength);
        out.output("Biggest square - " + calculator.getBiggerSquareArea().toString() + "\n");
        out.output("Circle - " + calculator.getCircleArea().toString() + "\n");
        out.output("Smallest square - " + calculator.getSmallerSquareArea().toString() + "\n");
    }
}
