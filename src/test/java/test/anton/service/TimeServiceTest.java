package test.anton.service;

import com.аnton.core.entity.Clock;
import com.аnton.core.service.TimeService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TimeServiceTest {
    public static TimeService timeService;

    @BeforeClass
    public static void setup() {
        timeService = new TimeService();
    }

    @Test
    public void calculateTimeValidTest() {
        int seconds = 84003;
        Clock clock1 = timeService.calculateTime(seconds);
        Clock clock2 = new Clock(23, 20, 3);
        assertEquals(clock1, clock2);
    }

    @Test
    public void calculateTimeInvalidTest() {
        int seconds = 84321;
        Clock clock1 = timeService.calculateTime(seconds);
        Clock clock2 = new Clock(23, 20, 3);
        assertNotEquals(clock1, clock2);
    }
}
