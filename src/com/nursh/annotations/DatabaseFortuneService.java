package com.nursh.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Value("${fortunes}")
    private String data;

    private String[] fortunes;
    private Random rand = new Random();

    public DatabaseFortuneService() {

    }

    @PostConstruct //Set up values after contructor
    public void setFortunes() {
        fortunes = data.split(", ");
    }

    @Override
    public String getFortune() {
        int index = rand.nextInt(fortunes.length);
        return fortunes[index];
    }
}
