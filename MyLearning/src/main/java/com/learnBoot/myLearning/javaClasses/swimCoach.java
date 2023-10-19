package com.learnBoot.myLearning.javaClasses;

import com.learnBoot.myLearning.Interfaces.Coach;

public class swimCoach implements Coach {
    public swimCoach() {
        System.out.println(" ******* Inside SWIMMING COACH CLASS *********");

    }

    @Override
    public String getDailyWorkout() {
        return "Swim Away from your sorrows!";
    }
}
