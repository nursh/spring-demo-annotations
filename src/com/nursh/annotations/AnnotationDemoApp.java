package com.nursh.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach federer = context.getBean("rogerFederer", Coach.class);
        Coach runner = context.getBean("runningCoach", Coach.class);
        System.out.println(federer.getDailyWorkout());
        System.out.println(runner.getDailyWorkout());
        context.close();
    }
}
