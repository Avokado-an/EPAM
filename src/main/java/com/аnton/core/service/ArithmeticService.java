package com.аnton.core.service;

import com.аnton.core.entity.Dot;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticService {
    public Double calculateXDependantFunc(int x) {
        if(x >= 3)
            return XMoreThanThreeFunc(x);
        return XLessThanThreeFunc(x);
    }

    private double XMoreThanThreeFunc(double x) {
        return 9 + 3*x - x*x;
    }

    private double XLessThanThreeFunc(double x) {
        return 1. / (Math.pow(x, 3) - 6);
    }

    public List<Dot> countTanInRange(double start, double end, double step) {
        List<Dot> res = new ArrayList<Dot>();
        for(;start <= end; start += step){
            res.add(new Dot(start, Math.tan(start)));
        }
        return res;
    }

    public Integer calculateSquareNumber(int number) {
        return (int) Math.pow(number, 2);
    }

    public Integer calculateLastDigitSquared(int number) {
        return (int) Math.pow(number % 10, 2) % 10;
    }

    public Boolean isPerfect(int number) {
        return number == calculateDivisorsSum(findAllDivisors(number));
    }

    private Integer calculateDivisorsSum(ArrayList<Integer> divisors) {
        int res = 0;
        for(Integer divisor: divisors) {
            res += divisor;
        }
        return res;
    }

    private ArrayList<Integer> findAllDivisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        divisors.add(1);
        for(int i = 2; i <= number / 2; i++)
            if(number % i == 0)
                divisors.add(i);
        return divisors;
    }
}