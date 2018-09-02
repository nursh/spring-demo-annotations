package com.nursh.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("rogerFederer")
public class TennisCoach implements Coach {


    private FortuneService fortuneService;

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
}
