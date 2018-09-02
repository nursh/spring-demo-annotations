package com.nursh.annotations;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

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
}
