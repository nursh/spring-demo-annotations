package com.nursh.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

//        Coach runner = context.getBean("runningCoach", Coach.class);
//        System.out.println("-------------------------");
//        System.out.println(runner.getDailyWorkout());
//        System.out.println(runner.getFortune());

        Coach swimmer = context.getBean("swimCoach", Coach.class);
        System.out.println("-------------------------");
        System.out.println(swimmer);
        System.out.println(swimmer.getDailyWorkout());
        System.out.println(swimmer.getFortune());
        context.close();
    }
}
