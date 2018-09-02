package com.nursh.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach federer = context.getBean("rogerFederer", Coach.class);
        Coach runner = context.getBean("runningCoach", Coach.class);
        Coach football = context.getBean("footballCoach", Coach.class);
        System.out.println(federer.getDailyWorkout());
        System.out.println(federer.getFortune());
        System.out.println(federer);
        System.out.println("-------------------------");
        System.out.println(runner.getDailyWorkout());
        System.out.println(runner.getFortune());
        System.out.println("-------------------------");
        System.out.println(football.getDailyWorkout());
        System.out.println(football.getFortune());
        context.close();
    }
}
