package service;

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
    public static void initialize() {
        arithmeticService = new ArithmeticService();
    }

    @Test
    public void testValidXDependantHigherFunc() {
        int x = 3;
        double res = arithmeticService.calculateXDependantFunc(x);
        double delta = Math.abs(res / 1000);
        assertEquals(res, 9, delta);
    }

    @Test
    public void testValidXDependantSmallerFunc() {
        int x = 1;
        double res = arithmeticService.calculateXDependantFunc(x);
        double delta = Math.abs(res / 1000);
        assertEquals(res, -.2, delta);
    }

    @Test
    public void testInvalidXDependantHigherFunc() {
        int x = 4;
        double res = arithmeticService.calculateXDependantFunc(x);
        double delta = Math.abs(res / 1000);
        assertNotEquals(res, 9, delta);
    }

    @Test
    public void testInvalidXDependantSmallerFunc() {
        int x = 1;
        double res = arithmeticService.calculateXDependantFunc(x);
        double delta = Math.abs(res / 1000);
        assertNotEquals(res, -1, delta);
    }

    @Test
    public void testValidCalculateSquareNumber() {
        int x = 4;
        int res = arithmeticService.calculateSquareNumber(x);
        assertEquals(res, 16);
    }

    @Test
    public void testInvalidCalculateSquareNumber() {
        int x = 4;
        int res = arithmeticService.calculateSquareNumber(x);
        assertNotEquals(res, 9);
    }

    @Test
    public void testValidCalculateLastDigitSquared() {
        int x = 16;
        int res = arithmeticService.calculateLastDigitSquared(x);
        assertEquals(res, 6);
    }

    @Test
    public void testInvalidCalculateLastDigitSquared() {
        int x = 16;
        int res = arithmeticService.calculateLastDigitSquared(x);
        assertNotEquals(res, 1);
    }

    @Test
    public void testValidIsPerfectNumber() {
        int x = 6;
        boolean res = arithmeticService.isPerfect(x);
        assertTrue(res);
    }

    @Test
    public void testInvalidIsPerfectNumber() {
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
    public void testValidCountTanInRange(List<Dot> dotList) {
        List<Dot> expectedDots = arithmeticService.countTanInRange(3, 7, 2);
        assertEquals(expectedDots, dotList);
    }

    @Test(dataProvider = "dotList")
    public void testInvalidCountTanInRange(List<Dot> dotList) {
        List<Dot> expectedDots = arithmeticService.countTanInRange(3, 9, 2);
        assertNotEquals(expectedDots, dotList);
    }
}
