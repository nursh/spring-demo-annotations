package com.nursh.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("rogerFederer")
public class TennisCoach implements Coach {


    private FortuneService fortuneService;

    @Value("${coach.name}")
    private String name;

    @Value("${coach.trophyWon}")
    private String trophyWon;

    public TennisCoach() {

    }

    // Using setter injection
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practise backhand 50 times";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return String.format("I am %s, I have won %s", this.name, this.trophyWon);
    }
}
