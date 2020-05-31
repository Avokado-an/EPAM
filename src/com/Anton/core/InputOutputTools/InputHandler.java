package com.Anton.core.InputOutputTools;

import java.util.Scanner;

public class InputHandler {
    private Scanner in = new Scanner(System.in);
    OutputHandler out = new OutputHandler();

    public Integer inputInt(String message) {
        out.output(message);
        int res = 0;
        while (!checkInt())
            in.next();
        res = in.nextInt();
        return res;
    }

    public Double inputDouble(String message) {
        out.output(message);
        double res = 0;
        while (!checkDouble())
            in.next();
        res = in.nextDouble();
        return res;
    }

    public Float inputFloat(String message) {
        out.output(message);
        float res = 0;
        while (!checkFloat())
            in.next();
        res = in.nextFloat();
        return res;
    }

    public String inputString(String message) {
        out.output(message);
        in.nextLine();
        return in.nextLine();
    }

    public Integer inputIntWithMax(int max, String message) {
        int res = 0;
        do {
            out.output(message);
            while (!checkInt())
                in.next();
            res = in.nextInt();
        } while (res > max);
        return res;
    }

    public Double inputDoubleWithMax(double max, String message) {
        double res = 0;
        do {
            out.output(message);
            while (!checkDouble())
                in.next();
            res = in.nextDouble();
        } while (res > max);
        return res;
    }

    public Float inputFloatWithMax(float max, String message) {
        float res = 0;
        do {
            out.output(message);
            while (!checkFloat())
                in.next();
            res = in.nextFloat();
        } while (res > max);
        return res;
    }

    public Integer inputIntWithMin(int min, String message) {
        int res = 0;
        do {
            out.output(message);
            while (!checkInt())
                in.next();
            res = in.nextInt();
        } while (res < min);
        return res;
    }

    public Double inputDoubleWithMin(int min, String message) {
        double res = 0;
        do {
            out.output(message);
            while (!checkDouble())
                in.next();
            res = in.nextDouble();
        } while (res < min);
        return res;
    }

    public Float inputFloatWithMin(int min, String message) {
        float res = 0;
        do {
            out.output(message);
            while (!checkFloat())
                in.next();
            res = in.nextFloat();
        } while (res < min);
        return res;
    }

    public Integer inputIntInRange(int min, int max, String message) {
        int res = 0;
        do {
            out.output(message);
            while (!checkInt())
                in.next();
            res = in.nextInt();
        } while (res < min || res > max);
        return res;
    }

    public Double inputDoubleInRange(int min, int max, String message) {
        double res = 0;
        do {
            out.output(message);
            while (!checkDouble())
                in.next();
            res = in.nextDouble();
        } while (res < min || res > max);
        return res;
    }

    public Float inputFloatInRange(int min, int max, String message) {
        float res = 0;
        do {
            out.output(message);
            while (checkFloat())
                in.next();
            res = in.nextFloat();
        } while (res < min || res > max);
        return res;
    }

    private boolean checkInt() {
        return in.hasNextInt();
    }

    private boolean checkDouble() {
        return in.hasNextDouble();
    }

    private boolean checkFloat() {
        return in.hasNextFloat();
    }
}
