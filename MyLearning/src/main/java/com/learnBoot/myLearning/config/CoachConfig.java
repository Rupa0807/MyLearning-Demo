package com.learnBoot.myLearning.config;

import com.learnBoot.myLearning.Interfaces.Coach;
import com.learnBoot.myLearning.javaClasses.swimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {


@Bean
    public Coach swimCoach(){
      return  new swimCoach();
    }
}
