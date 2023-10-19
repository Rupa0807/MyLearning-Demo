package com.rupa.JPADemo;

import com.rupa.JPADemo.DAO.StudentDAO;
import com.rupa.JPADemo.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

    @Bean
	public CommandLineRunner myRun(StudentDAO studentDAO){
		return i->{
			CreateStudent(studentDAO);
			//RetrieveStudent(studentDAO);
		  //getAllStudent(studentDAO);
			//QueryStudentByLastName(studentDAO);
			//updateStudentByLastname(studentDAO);
			//updateAllStudent(studentDAO);
			//RemoveStudent(studentDAO);
			//RemoveAll(studentDAO);


		};
	}

	private void RemoveAll(StudentDAO studentDAO) {
		studentDAO.DeleteAll();
	}

	private void RemoveStudent(StudentDAO studentDAO) {

		studentDAO.DeleteStudent(9L);
	}

	private void updateAllStudent(StudentDAO studentDAO) {
		List<Student> studList =new ArrayList<>(studentDAO.findAll());
//		for(Student i: studList){
//			i.setFirstName("Test");
//		}
		studentDAO.UpdateAll(studList);
	}

	private void updateStudentByLastname(StudentDAO studentDAO) {
		Student s= studentDAO.findById(8L);
		s.setLastName("ZZZZZZZ");
		studentDAO.Update(s);
		System.out.println("Student Details: "+s);
	}

	private void QueryStudentByLastName(StudentDAO studentDAO) {
		List<Student> studentByLName= studentDAO.findByLastName("V");
		for(Student i:studentByLName){
			System.out.println("student: " + i);
		}


	}

	private void getAllStudent(StudentDAO studentDAO) {
		List<Student> studentList= new ArrayList<>(studentDAO.findAll());
		for(Student i:studentList) {
			System.out.println(i);
		}
	}

	private void RetrieveStudent(StudentDAO studentDAO) {
		Student s=studentDAO.findById(8L);
		System.out.println(s);
		System.out.println("Name:"+s.getFirstName()+"\n"+ "ID:"+s.getId()+"\n"+"mail:"+s.getEmail());

	}

	private void CreateStudent(StudentDAO studentDAO) {

		// Creating STUDENT
		System.out.println("Creating STUDENT");
		Student s1= new Student("theta","omega","test@gmail.com");
		Student s2= new Student("Gamma","Lady Gaaga","CCC@gmail.com");

		//Saving STUDENT
		System.out.println("Saving STUDENT");
		studentDAO.Save(s1);
		studentDAO.Save(s2);


		//Display STUDENT ID of the inserted record
		System.out.println("Displaying STUDENT");

		System.out.println("Name="+s1.getFirstName()+" \n"+"ID="+s1.getId());

	}

}
