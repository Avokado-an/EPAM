package com.Anton.core.task2;

import com.Anton.core.InputOutputTools.OutputHandler;
import com.Anton.core.InputOutputTools.InputHandler;

public class Main {
    public static void main(String[] args) {
        OutputHandler out = new OutputHandler();
        InputHandler in = new InputHandler();
        int year = in.inputIntWithMin(0, "Year - ");
        MonthSpecifier monthSpecifier = new MonthSpecifier(year);
        String month = in.inputString("Month - ");
        out.output(monthSpecifier.getDays(month));
    }
}
