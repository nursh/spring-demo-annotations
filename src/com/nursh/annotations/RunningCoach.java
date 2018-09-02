package com.nursh.annotations;

import org.springframework.stereotype.Component;

@Component // using default name
public class RunningCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run for 2km in the morning";
    }
}
