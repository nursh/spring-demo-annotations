package com.nursh.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // using default name of class
public class RunningCoach implements Coach {

    private FortuneService fortuneService;

    //Using constructor injection
    @Autowired
    public RunningCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run for 2km in the morning";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
