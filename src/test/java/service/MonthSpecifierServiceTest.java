package service;

import com.аnton.core.service.MonthSpecifierService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MonthSpecifierServiceTest {
    public static MonthSpecifierService monthService;

    @BeforeClass
    public static void setup() {
        monthService = new MonthSpecifierService();
    }

    @DataProvider(name = "validMonthAndDay")
    public Object[][] createValidMonths() {
        return new Object[][]{
                {2020, "FEBRUARY", 29},
                {2020, "MARCH", 31},
                {2021, "FEBRUARY", 28},
                {2021, "MARCH", 31}
        };
    }

    @Test(dataProvider = "validMonthAndDay")
    public void calculateAmountOfDaysValidTest(int year, String month, int expectedDays) {
        int days = monthService.calculateAmountOfDays(month, year);
        assertEquals(days, expectedDays);
    }

    @DataProvider(name = "invalidMonthAndDay")
    public Object[][] createInvalidMonths() {
        return new Object[][]{
                {2020, "FEBRUARY", 28},
                {2020, "MARCH", 32},
                {1900, "FEBRUARY", 29},
                {1900, "MARCH", 30}
        };
    }

    @Test(dataProvider = "invalidMonthAndDay")
    public void calculateAmountOfDaysInvalidTest(int year, String month, int expectedDays) {
        int days = monthService.calculateAmountOfDays(month, year);
        assertNotEquals(days, expectedDays);
    }
}
