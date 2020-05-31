package com.Anton.core.task5;

import java.util.ArrayList;

class PerfectNumberChecker {
    private int number;

    PerfectNumberChecker(int number) {
        this.number = number;
    }

    Boolean isPerfect() {
        return number == getDivisorsSum(getDivisors());
    }

    private ArrayList<Integer> getDivisors() {
        ArrayList<Integer> divisors = new ArrayList<>();
        divisors.add(1);
        for(int i = 2; i <= number / 2; i++)
            if(number % i == 0)
                divisors.add(i);
        return divisors;
    }

    private Integer getDivisorsSum(ArrayList<Integer> divisors) {
        int res = 0;
        for(Integer divisor: divisors) {
            res += divisor;
        }
        return res;
    }
}
