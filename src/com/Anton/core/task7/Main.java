package com.Anton.core.task7;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main(String[] args) {
        OutputHandler out= new OutputHandler();
        InputHandler in = new InputHandler();
        Coordinates coordinate1 = new Coordinates(
                in.inputInt("X1 - "), in.inputInt("Y1 - ")
        );
        Coordinates coordinate2 = new Coordinates(
                in.inputInt("X2 - "), in.inputInt("Y2 - ")
        );

        if(coordinate1.compareTo(coordinate2) > 0)
            out.output("Second dot is closer");
        else if(coordinate1.compareTo(coordinate2) < 0)
            out.output("First dot is closer");
        else
            out.output("They are on the same distance");
    }
}
