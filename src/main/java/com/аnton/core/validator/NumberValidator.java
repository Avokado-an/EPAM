package com.аnton.core.validator;

import com.аnton.core.exception.NumberParserException;

public class NumberValidator {
    private com.аnton.core.validator.parser.NumberParser validator = new com.аnton.core.validator.parser.NumberParser();

    public Integer validateIntInRange(String number, String min, String max) throws NumberParserException {
        if (validator.isValidInt(number) && validator.isValidInt(max) && validator.isValidInt(min)) {
            int res = Integer.parseInt(number);
            int maximum = Integer.parseInt(max);
            int minimum = Integer.parseInt(min);
            if (res <= maximum && res >= minimum)
                return res;
        }
        throw new NumberParserException("Unable to parse String to Integer in range");
    }

    public Integer validateIntWithMin(String number, String min) throws NumberParserException {
        if (validator.isValidInt(number) && validator.isValidInt(min)) {
            int res = Integer.parseInt(number);
            int minimum = Integer.parseInt(min);
            if (res >= minimum)
                return res;
        }
        throw new NumberParserException("Unable to parse String to Integer with min value");
    }

    public Integer validateIntWithMax(String number, String max) throws NumberParserException {
        if (validator.isValidInt(number) && validator.isValidInt(max)) {
            int res = Integer.parseInt(number);
            int maximum = Integer.parseInt(max);
            if (res <= maximum)
                return res;
        }
        throw new NumberParserException("Unable to parse String to Integer with max value");
    }

    public Integer validateInt(String number) throws NumberParserException {
        if (validator.isValidInt(number)) {
            return Integer.parseInt(number);
        }
        throw new NumberParserException("Unable to parse String to Integer");
    }

    public Float validateFloatInRange(String number, String min, String max) throws NumberParserException {
        if (validator.isValidFloat(number) && validator.isValidFloat(max) && validator.isValidFloat(min)) {
            float minimum = Float.parseFloat(min);
            float maximum = Float.parseFloat(max);
            float res = Float.parseFloat(number);
            if (res <= maximum && res >= minimum)
                return res;
        }
        throw new NumberParserException("Unable to parse String to Float in range");
    }

    public Float validateFloatWithMin(String number, String min) throws NumberParserException {
        if (validator.isValidFloat(number) && validator.isValidFloat(min)) {
            float minimum = Float.parseFloat(min);
            float res = Float.parseFloat(number);
            if (res >= minimum)
                return res;
        }
        throw new NumberParserException("Unable to parse String to Float with min value");
    }

    public Float validateFloatWithMax(String number, String max) throws NumberParserException {
        if (validator.isValidFloat(number) && validator.isValidFloat(max)) {
            float maximum = Float.parseFloat(max);
            float res = Float.parseFloat(number);
            if (res <= maximum)
                return res;
        }
        throw new NumberParserException("Unable to parse String to Float with max Value");
    }

    public Float validateFloat(String number) throws NumberParserException {
        if (validator.isValidFloat(number)) {
            return Float.parseFloat(number);
        }
        throw new NumberParserException("Unable to parse String to Float");
    }
}
