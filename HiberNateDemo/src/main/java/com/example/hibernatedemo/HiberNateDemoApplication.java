package com.example.hibernatedemo;

import com.example.hibernatedemo.Entity.Instructor;
import com.example.hibernatedemo.Entity.InstructorDetails;
import com.example.hibernatedemo.Repository.InstructorRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HiberNateDemoApplication implements CommandLineRunner {


	@Autowired
	private InstructorRepository instructorRepository;
	public static void main(String[] args) {
		SpringApplication.run(HiberNateDemoApplication.class, args);


	}




	@Override
	public void run(String... args) throws Exception {
		Instructor instructor=new Instructor("Rupa","Gu","rupa@gmail.com");
		InstructorDetails instructorDetails= new InstructorDetails("SSZone","coding");
        instructor.setInstructorDetails(instructorDetails);

		instructorRepository.save(instructor);



	}
}
