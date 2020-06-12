package service;

import com.аnton.core.service.EvenElementsService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class EvenElementsServiceTest {
    private static EvenElementsService elementsService;

    @BeforeClass
    public static void setup() {
        elementsService = new EvenElementsService();
    }

    @Test
    public void testValidEvenNumberChecker() {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4);
        boolean result = elementsService.doesContainTwoEvens(elements);
        assertTrue(result);
    }

    @Test
    public void testInvalidEvenNumberChecker() {
        List<Integer> elements = Arrays.asList(1, 1, 3, 4);
        boolean result = elementsService.doesContainTwoEvens(elements);
        assertFalse(result);
    }
}
