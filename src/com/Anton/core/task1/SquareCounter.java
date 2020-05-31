package com.Anton.core.task1;

class SquareCounter {
    final static int MAX_VALUE = 46340;

    int getSquare(int x) {
        return x * x;
    }

    int getLastDigit(int x) {
        return x % 10;
    }

    int getLastSquareDigit(int x) {
        return getLastDigit(getSquare(getLastDigit(x)));
    }
}
