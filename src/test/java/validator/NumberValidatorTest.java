package validator;


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
    public void testValidIntParsingInRange() {
        try {
            String min = "1";
            String max = "10";
            String number = "3";
            int res = validator.parseIntInRange(number, min, max);
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
    public void testExceptionIntParsingInRange(String min, String max, String number) throws NumberParserException {
        validator.parseIntInRange(number, min, max);
    }

    @Test
    public void testValidIntParsingWithMin() {
        try {
            String min = "1";
            String number = "1234";
            int res = validator.parseIntWithMin(number, min);
            assertEquals(res, 1234);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @Test(expectedExceptions = NumberParserException.class)
    public void testExceptionIntParsingWithMin() throws NumberParserException {
        String min = "1234";
        String number = "1";
        validator.parseIntWithMin(number, min);
    }

    @Test
    public void testValidIntParsingWithMax() {
        try {
            String max = "12345";
            String number = "1234";
            int res = validator.parseIntWithMax(number, max);
            assertEquals(res, 1234);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @Test(expectedExceptions = NumberParserException.class)
    public void testExceptionIntParsingWithMax() throws NumberParserException {
        String max = "1234";
        String number = "12345";
        validator.parseIntWithMax(number, max);
    }

    @Test
    public void testValidFloatParsingInRange() {
        try {
            String min = "1.";
            String max = "10.";
            String number = "3.";
            validator.parseFloatInRange(number, min, max);
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
    public void testExceptionFloatParsingInRange(String min, String max, String number) throws NumberParserException {
        validator.parseFloatInRange(number, min, max);
    }

    @Test
    public void testValidFloatParsingWithMin() {
        try {
            String min = "1.";
            String number = "1234.";
            validator.parseFloatWithMin(number, min);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @Test(expectedExceptions = NumberParserException.class)
    public void testExceptionFloatParsingWithMin() throws NumberParserException {
        String min = "1234.";
        String number = "1.";
        validator.parseIntWithMin(number, min);
    }

    @Test
    public void testValidFloatParsingWithMax() {
        try {
            String max = "12345.";
            String number = "1234.";
            validator.parseFloatWithMax(number, max);
        } catch (NumberParserException ex) {
            fail();
        }
    }

    @Test(expectedExceptions = NumberParserException.class)
    public void testExceptionFloatParsingWithMax() throws NumberParserException {
        String max = "1234.";
        String number = "12345";
        validator.parseFloatWithMax(number, max);
    }
}
