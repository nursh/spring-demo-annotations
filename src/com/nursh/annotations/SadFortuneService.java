package com.nursh.annotations;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Fall down bozo!!!";
    }
}
