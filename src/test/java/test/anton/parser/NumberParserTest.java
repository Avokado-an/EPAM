package test.anton.parser;

import com.аnton.core.validator.parser.NumberParser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class NumberParserTest {
    public static NumberParser parser;

    @BeforeClass
    public static void setup() {
        parser = new NumberParser();
    }

    @Test
    public void stringToIntValidTest() {
        boolean isValid = parser.isValidInt("13");
        assertTrue(isValid);
    }

    @Test
    public void stringToIntInvalidTest() {
        boolean isValid = parser.isValidFloat("13.3qwerw");
        assertFalse(isValid);
    }

    @Test
    public void stringToDoubleValidTest() {
        boolean isValid = parser.isValidFloat("13.3");
        assertTrue(isValid);
    }

    @Test
    public void stringToDoubleInvalidTest() {
        boolean isValid = parser.isValidFloat("13.3qwrwer");
        assertFalse(isValid);
    }
}
