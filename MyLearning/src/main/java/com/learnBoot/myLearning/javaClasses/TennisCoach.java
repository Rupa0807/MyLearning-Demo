package com.learnBoot.myLearning.javaClasses;

import com.learnBoot.myLearning.Interfaces.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("******* Inside TENNIS COACH CLASS *********");
    }

    @Override
    public String getDailyWorkout() {
        return "play tennis everyday! Stay Healthy!!";
    }
}
