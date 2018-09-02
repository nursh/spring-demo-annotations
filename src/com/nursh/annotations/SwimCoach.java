package com.nursh.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${swim.coach}")
    private String name;

    @Value("${swim.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 30 laps every 2 days.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String toString() {
        return String.format("I am %s and I coach %s swimming team", this.name, this.team);
    }
}
