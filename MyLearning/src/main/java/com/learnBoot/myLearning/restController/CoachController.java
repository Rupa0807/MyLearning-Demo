package com.learnBoot.myLearning.restController;

import com.learnBoot.myLearning.Interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach coach;
    private Coach subCoach;
@Autowired
@Qualifier("swimCoach")
    public void setSubCoach(Coach subCoach) {
        this.subCoach = subCoach;
    }

    public CoachController() {
        System.out.println(" ******* Inside REST CONTROLLER COACH CLASS *********");
    }

    @Autowired
@Qualifier("baseballCoach")

public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "CoachController{" +
                "coach=" + coach +
                ", subCoach=" + subCoach +
                '}';
    }

    @GetMapping("/callCoach")
public String getCoach() {
        return subCoach.getDailyWorkout();
    }
        @GetMapping("/scope")
        public String getScope() {
          // System.out.println("Coach:"+ coach.toString()+"\n"+ "Subcoach:""%s\nisequal%s".formatted(subCoach.toString(), coach.equals(subCoach)));
        return"Coach:"+ coach+"\n"+"Subcoach:"+subCoach.toString()+"isequal:"+subCoach.equals(coach);
        }





}
