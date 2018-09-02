package com.nursh.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private Random rand = new Random();

    private final String[] fortunes = {
            "Break a leg",
            "Just do it",
            "Never give up hope"
    };

    @Override
    public String getFortune() {
        int index = rand.nextInt(fortunes.length);
        return fortunes[index];
    }
}
