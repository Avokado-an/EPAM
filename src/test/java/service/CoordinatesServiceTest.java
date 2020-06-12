package service;

import com.аnton.core.entity.Dot;
import com.аnton.core.service.CoordinatesService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CoordinatesServiceTest {
    private static CoordinatesService coordinatesService;

    @BeforeClass
    public static void initialize() {
        coordinatesService = new CoordinatesService();
    }

    @DataProvider(name = "validCoordinates")
    public Object[][] createValidCoordinates (){
        return new Object[][] {
                {new Dot(3, 4), new Dot(4, 5), 1},
                {new Dot(5, 4), new Dot(4, 3), -1},
                {new Dot(3, 4), new Dot(4, 3), 0}
        };
    }

    @Test(dataProvider = "validCoordinates")
    public void compareDistanceValidTest(Dot dot1, Dot dot2, int comparison) {
        int closerDot = coordinatesService.compareDistance(dot1, dot2);
        assertEquals(closerDot, comparison);
    }

    @DataProvider(name = "invalidCoordinates")
    public Object[][] createInvalidCoordinates (){
        return new Object[][] {
                {new Dot(3, 4), new Dot(4, 5), -1},
                {new Dot(5, 4), new Dot(4, 3), 0},
                {new Dot(3, 4), new Dot(4, 3), 1}
        };
    }

    @Test(dataProvider = "invalidCoordinates")
    public void compareDistanceInvalidTest(Dot dot1, Dot dot2, int comparison) {
        int closerDot = coordinatesService.compareDistance(dot1, dot2);
        assertNotEquals(closerDot, comparison);
    }
}
