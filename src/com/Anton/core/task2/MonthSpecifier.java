package com.Anton.core.task2;

import java.util.HashMap;
import java.util.Map;

class MonthSpecifier {
    private Map<String, Integer> months = new HashMap<>();

    MonthSpecifier(int year) {
        months.put("january", 31);
        if (checkLeapYear(year))
            months.put("february", 29);
        else
            months.put("february", 28);
        months.put("march", 31);
        months.put("april", 31);
        months.put("may", 31);
        months.put("june", 30);
        months.put("july", 31);
        months.put("august", 31);
        months.put("september", 30);
        months.put("october", 31);
        months.put("november", 30);
        months.put("december", 31);
    }

    String getDays(String month) {
        if (months.containsKey(month))
            return months.get(month).toString();
        return "No such month";
    }

    private boolean checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        else return year % 400 == 0;
    }
}
