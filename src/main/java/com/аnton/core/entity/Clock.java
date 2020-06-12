package com.аnton.core.entity;

public class Clock {
    int hours;
    int minutes;
    int seconds;

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private String checkTimeDigits(int time) {
        if(time < 10)
            return String.format("0%d", time);//"0" + time;
        return String.format("%d", time);
    }

    @Override
    public String toString() {
        return String.format("%s:%s:%s", checkTimeDigits(hours), checkTimeDigits(minutes), checkTimeDigits(seconds));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Clock))
            return false;
        Clock clock = (Clock) o;
        return getHours() == clock.getHours() &&
                getMinutes() == clock.getMinutes() &&
                getSeconds() == clock.getSeconds();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + seconds;
        result = 31 * result + minutes;
        result = 31 * result + hours;
        return result;
    }
}
