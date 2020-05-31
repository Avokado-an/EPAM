package com.Anton.core.task9;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main (String[] args) {
        OutputHandler out = new OutputHandler();
        InputHandler in = new InputHandler();
        double radius = in.inputDoubleWithMin(0, "Radius - ");
        Circle circle = new Circle(radius);
        out.output("Area: " + circle.getArea() + "\n");
        out.output("Length: " + circle.getLength() + "\n");
    }
}
