package com.Anton.core.task6;

class SecondsCounter {
    private int seconds;
    private int hours = 0;
    private int minutes = 0;
    static final int MAX_SECONDS = 86400;

    SecondsCounter(int seconds) {
        this.seconds = seconds;
        getMinutes();
        getHours();
    }

    String getTime() {
        String res = "";
        res += checkTimeDigits(hours) + ":";
        res += checkTimeDigits(minutes) + ":";
        res += checkTimeDigits(seconds);
        return res;
    }

    private String checkTimeDigits(int time) {
        if(time < 10)
            return "0" + time;
        return "" + time;
    }

    private void getMinutes() {
        minutes = seconds / 60;
        seconds %= 60;
    }

    private void getHours() {
        hours = minutes / 60;
        minutes %= 60;
    }


}
