package com.nursh.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("databaseFortuneService")
    private FortuneService fortuneService;

    public FootballCoach() {

    }

    @PostConstruct
    public void startUp() {
        System.out.println("Starting and setting values up");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Doing clean up stuff for code");
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
