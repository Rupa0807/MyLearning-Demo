package com.learnBoot.myLearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyLearningApplication.class, args);
	}



	@Bean
	public  CommandLineRunner c(String[] arg0) throws Exception {
		return c->{System.out.println("Hello world from Command Line Runner");;};
	}
}
