package com.learnBoot.myLearning.restController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myTestRest {

    @Value("${user.name}")
    private String userName;
    @Value("${login.pwd}")
    private String userPassword;

    @GetMapping("/hello")
    public String myHello(){
        return "Hello World";
    }

    @GetMapping("/login")
    public String login(){
        return "username:" +userName+'\n'+ "password:"+ userPassword;
    }
  @GetMapping("/welcome")
  public String welcome(){
      return "Welcome Rupa!";
  }

}
