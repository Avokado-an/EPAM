package test.anton.service;

import com.аnton.core.entity.Dot;
import com.аnton.core.service.ArithmeticService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ArithmeticServiceTest {
    private static ArithmeticService arithmeticService;

    @BeforeClass
    public static void setup() {
        arithmeticService = new ArithmeticService();
    }

    @DataProvider(name = "validX")
    public Object[][] createValidX() {
        return new Object[][]{
                {3, 9, 0.001},
                {1, -.2, 0.001}
        };
    }

    @Test(dataProvider = "validX")
    public void calculateXDependantFuncValidTest(int x, double actual, double delta) {
        double res = arithmeticService.calculateXDependantFunc(x);
        assertEquals(res, actual, delta);
    }

    @DataProvider(name = "invalidX")
    public Object[][] createInvalidX() {
        return new Object[][]{
                {4, 9, 0.001},
                {1, -1, 0.001}
        };
    }

    @Test(dataProvider = "invalidX")
    public void calculateXDependantFuncInvalidTest(int x, double actual, double delta) {
        double res = arithmeticService.calculateXDependantFunc(x);
        assertNotEquals(res, actual, delta);
    }

    @Test
    public void calculateSquareNumberValidTest() {
        int x = 4;
        int res = arithmeticService.calculateSquareNumber(x);
        assertEquals(res, 16);
    }

    @Test
    public void calculateSquareNumberInvalidTest() {
        int x = 4;
        int res = arithmeticService.calculateSquareNumber(x);
        assertNotEquals(res, 9);
    }

    @Test
    public void calculateLastDigitSquaredValidTest() {
        int x = 16;
        int res = arithmeticService.calculateLastDigitSquared(x);
        assertEquals(res, 6);
    }

    @Test
    public void calculateLastDigitSquaredInvalidTest() {
        int x = 16;
        int res = arithmeticService.calculateLastDigitSquared(x);
        assertNotEquals(res, 1);
    }

    @Test
    public void isPerfectNumberValidTest() {
        int x = 6;
        boolean res = arithmeticService.isPerfect(x);
        assertTrue(res);
    }

    @Test
    public void isPerfectNumberInvalidTest() {
        int x = 7;
        boolean res = arithmeticService.isPerfect(x);
        assertFalse(res);
    }

    @DataProvider(name = "dotList")
    public Object[][] createDotList() {
        return new Object[][]{
                {Arrays.asList(
                        new Dot(3, Math.tan(3)), new Dot(5, Math.tan(5)), new Dot(7, Math.tan(7))
                )}
        };
    }

    @Test(dataProvider = "dotList")
    public void countTanInRangeValidTest(List<Dot> dotList) {
        List<Dot> expectedDots = arithmeticService.countTanInRange(3, 7, 2);
        assertEquals(expectedDots, dotList);
    }

    @Test(dataProvider = "dotList")
    public void countTanInRangeInvalidTest(List<Dot> dotList) {
        List<Dot> expectedDots = arithmeticService.countTanInRange(3, 9, 2);
        assertNotEquals(expectedDots, dotList);
    }
}
