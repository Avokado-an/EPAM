package com.аnton.core.service;

import com.аnton.core.entity.Month;

public class MonthSpecifierService {
    public int calculateAmountOfDays(String month, int year) {
        try {
            Month months = Month.valueOf(month);
            int days = months.getDays();
            if (months == Month.FEBRUARY && isLeapYear(year))
                days++;
            return days;
        } catch (IllegalArgumentException ex) {
            return -1;
        }
    }

    private boolean isLeapYear(int year) {
        int leapYearCounter = 4;
        int nonLeapYearCounter = 100;
        int specialLeapYearCounter = 400;
        if (year % leapYearCounter == 0 && year % nonLeapYearCounter != 0)
            return true;
        else return year % specialLeapYearCounter == 0;
    }
}
