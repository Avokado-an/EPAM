package com.anton.test.validator;


import com.аnton.core.exception.NumberParserException;
import com.аnton.core.validator.NumberValidator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberValidatorTest {
    public static NumberValidator validator;

    @BeforeClass
    public static void setup() {
        validator = new NumberValidator();
    }

    @Test
    public void validateIntInRangeValidTest() {
        try {
            String min = "1";
            String max = "10";
            String number = "3";
            int res = validator.validateIntInRange(number, min, max);
            assertEquals(res, 3);
        } catch(NumberParserException ex) {
            fail();
        }
    }

    @DataProvider(name = "invalidIntInRange")
    public Object[][] createInvalidInt() {
        return new Object[][]{
                {"1", "10", "1234"},
                {"1", "10", "-2"}
        };
    }

    @Test(expectedExceptions = NumberParserException.class, dataProvider = "invalidIntInRange")
    public void validateIntInRangeExceptionTest(String min, String max, String number) throws NumberParserException {
        validator.validateIntInRange(number, min, max);
    }

    @Test
    public void validateIntWithMinValidTest() {
        try {
            String min = "1";
            String number = "1234";
            int res = validator.validateIntWithMin(number, min);
            assertEquals(res, 1234);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @Test(expectedExceptions = NumberParserException.class)
    public void validateIntWithMinExceptionTest() throws NumberParserException {
        String min = "1234";
        String number = "1";
        validator.validateIntWithMin(number, min);
    }

    @Test
    public void validateIntWithMaxValidTest() {
        try {
            String max = "12345";
            String number = "1234";
            int res = validator.validateIntWithMax(number, max);
            assertEquals(res, 1234);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @Test(expectedExceptions = NumberParserException.class)
    public void validateIntWithMaxExceptionTest() throws NumberParserException {
        String max = "1234";
        String number = "12345";
        validator.validateIntWithMax(number, max);
    }

    @Test
    public void validateFloatInRangeValidTest() {
        try {
            String min = "1.";
            String max = "10.";
            String number = "3.";
            validator.validateFloatInRange(number, min, max);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @DataProvider(name = "invalidFloatInRange")
    public Object[][] createInvalidFloat() {
        return new Object[][]{
                {"1.", "10.", "1234."},
                {"1.", "10.", "-2."}
        };
    }

    @Test(expectedExceptions = NumberParserException.class, dataProvider = "invalidFloatInRange")
    public void validateFloatInRangeExceptionTest(String min, String max, String number) throws NumberParserException {
        validator.validateFloatInRange(number, min, max);
    }

    @Test
    public void validateFloatWithMinValidTest() {
        try {
            String min = "1.";
            String number = "1234.";
            validator.validateFloatWithMin(number, min);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @Test(expectedExceptions = NumberParserException.class)
    public void validateFloatWithMinExceptionTest() throws NumberParserException {
        String min = "1234.";
        String number = "1.";
        validator.validateIntWithMin(number, min);
    }

    @Test
    public void validateFloatWithMaxValidTest() {
        try {
            String max = "12345.";
            String number = "1234.";
            validator.validateFloatWithMax(number, max);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @Test(expectedExceptions = NumberParserException.class)
    public void validateFloatWithMaxExceptionTest() throws NumberParserException {
        String max = "1234.";
        String number = "12345";
        validator.validateFloatWithMax(number, max);
    }
}
