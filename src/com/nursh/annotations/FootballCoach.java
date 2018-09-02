package com.nursh.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;

    public FootballCoach() {

    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Run 24 laps on the field";
    }
}
