package service;

import com.аnton.core.service.SquareService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareServiceTest {
    public static SquareService squareService;

    @BeforeClass
    public static void setup() {
        squareService = new SquareService();
    }

    @Test
    public void validSideFromDiagonalCalculation() {
        double diagonal = 4.;
        double expectedLength = squareService.calculateSideFromDiagonal(diagonal);
        double actualLength = 4 / Math.sqrt(2);
        double delta = expectedLength / 10000;
        assertEquals(expectedLength, actualLength, delta);
    }

    @Test
    public void invalidSideFromDiagonalCalculation() {
        double diagonal = 4.;
        double expectedLength = squareService.calculateSideFromDiagonal(diagonal + 1);
        double actualLength = 4 / Math.sqrt(2);
        double delta = expectedLength / 10000;
        assertNotEquals(expectedLength, actualLength, delta);
    }

    @Test
    public void validAreaCalculation() {
        double side = 4.5;
        double expectedArea = squareService.calculateArea(side);
        double actualArea = Math.pow(side, 2);
        double delta = side / 10000;
        assertEquals(expectedArea, actualArea, delta);
    }

    @Test
    public void invalidAreaCalculation() {
        double side = 4.5;
        double expectedArea = squareService.calculateArea(side + 1);
        double actualArea = Math.pow(side, 2);
        double delta = side / 10000;
        assertNotEquals(expectedArea, actualArea, delta);
    }
}
