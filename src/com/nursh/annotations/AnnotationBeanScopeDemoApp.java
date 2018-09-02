package com.nursh.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach aCoach = context.getBean("runningCoach", Coach.class);
        Coach bCoach = context.getBean("runningCoach", Coach.class);

        System.out.println(aCoach);
        System.out.println(bCoach);

        context.close();

    }



}
