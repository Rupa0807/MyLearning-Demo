package com.learnBoot.myLearning.javaClasses;

import com.learnBoot.myLearning.Interfaces.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {

    public CricketCoach() {
     System.out.println(" ******* Inside CRICKET COACH CLASS **********");
    }

    @Override
    public String getDailyWorkout() {
        return "play cricket for 30 min..lol";
    }
}
