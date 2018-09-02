package com.nursh.annotations;

import org.springframework.stereotype.Component;

@Component("rogerFederer")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "practise backhand 50 times";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
