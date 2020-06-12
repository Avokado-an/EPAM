package com.аnton.core.service;

import java.util.List;

public class EvenElementsService {
    public Boolean doesContainTwoEvens(List<Integer> arr) {
        int counter = 0;
        for (Integer elem : arr) {
            if (elem % 2 == 0)
                counter++;
        }
        return counter >= 2;
    }
}
