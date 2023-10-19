package com.learnBoot.myLearning.javaClasses;

import com.learnBoot.myLearning.Interfaces.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class BaseballCoach implements Coach{
    public BaseballCoach() {
        System.out.println(" ******* Inside BASEBALL COACH CLASS *********");
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball is a nice game";
    }

    @PostConstruct
    public void initMethod() {
        System.out.println( "Inside Post construct");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println( "Inside Pre Destroy ");
    }

}
