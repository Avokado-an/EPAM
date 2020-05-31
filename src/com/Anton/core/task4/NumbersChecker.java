package com.Anton.core.task4;

import java.util.ArrayList;

class NumbersChecker {
    private ArrayList<Integer> numbers = new ArrayList<>();

    NumbersChecker(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    NumbersChecker() {
    }

    void addElement(int element) {
        numbers.add(element);
    }

    Boolean findEven() {
        int counter = 0;
        for(Integer number: numbers){
            if(number % 2 == 0)
                counter++;
        }
        return counter >= 2;
    }
}
