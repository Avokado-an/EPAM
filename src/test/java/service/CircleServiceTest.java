package service;

import com.аnton.core.service.CircleService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class CircleServiceTest {
    private static CircleService circleService;

    @BeforeClass
    public static void initialize() {
        circleService = new CircleService();
    }

    @Test
    public void testValidCalculatingArea() {
        double radius = 5d;
        double area = circleService.calculateArea(radius);
        double realArea = 78.5;
        double delta = radius / 10000;
        assertEquals(area, realArea, delta);
    }

    @Test
    public void testInvalidCalculatingArea() {
        double radius = 5d;
        double area = circleService.calculateArea(radius);
        double falseArea = 43.5;
        double delta = radius / 10000;
        assertNotEquals(area, falseArea, delta);
    }

    @Test
    public void testValidCalculatingLength() {
        double radius = 5d;
        double area = circleService.calculateLength(radius);
        double realLength = 31.4;
        double delta = radius / 10000;
        assertEquals(area, realLength, delta);
    }

    @Test
    public void testInvalidCalculatingLength() {
        double radius = 5d;
        double area = circleService.calculateArea(radius);
        double falseLength = 23.4;
        double delta = radius / 10000;
        assertNotEquals(area, falseLength, delta);
    }
}
