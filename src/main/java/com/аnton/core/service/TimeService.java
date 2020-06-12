package com.аnton.core.service;

import com.аnton.core.entity.Clock;

public class TimeService {
    public static final int SECONDS_PER_DAY = 86400;

    public Clock calculateTime(int allSeconds) {
        int seconds = allSeconds % 60;
        int minutes = allSeconds / 60;
        int hours = minutes / 60;
        minutes %= 60;
        return new Clock(hours, minutes, seconds);
    }
}
