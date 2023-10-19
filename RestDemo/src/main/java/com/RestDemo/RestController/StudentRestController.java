package com.RestDemo.RestController;

import com.RestDemo.Utlity.StudentNotFoundExceptionClass;
import com.RestDemo.Utlity.studentErrorResponseClass;
import com.RestDemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {
  private List<Student> studentList;

    @PostConstruct
    public void loadStudents(){
        System.out.println("Inside PostConstruct Method");
        studentList= new ArrayList<Student>();
        Student s1= new Student("Rupa","Gu");
        Student s2= new Student("Shrivas","V");
        Student s3= new Student("Sarvesh","V");
        Student s4= new Student("Vishnu","Gu");
        studentList.add(s1);
        studentList.add(s2);studentList.add(s3);
        studentList.add(s4);
    }
@GetMapping("/list")
    public List<Student> getStudents(){


        return studentList;
    }

    @GetMapping("/list/{studentID}")

    public Student getStudents(@PathVariable ("studentID" ) Integer studentID){

     if(studentID ==null ||studentID>3 ||studentID<0) {
         throw new StudentNotFoundExceptionClass("Student ID Not found " + studentID);
     }
        return studentList.get(studentID);
    }

@ExceptionHandler
    public ResponseEntity<studentErrorResponseClass> StudentExceptionHandler(StudentNotFoundExceptionClass e){
        studentErrorResponseClass response= new studentErrorResponseClass();
        response.setError(e.getMessage());
    String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss").format(Calendar.getInstance().getTime());
       // response.setE(new StudentNotFoundExceptionClass("Student ID invalid"));
        response.setStatusCode(HttpStatus.NOT_FOUND.toString());
        response.setTimestamp(timeStamp);
         return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<studentErrorResponseClass> ExceptionHandler(Exception e){
        studentErrorResponseClass response= new studentErrorResponseClass();
        response.setError(e.getMessage());
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        // response.setE(new StudentNotFoundExceptionClass("Student ID invalid"));
        response.setStatusCode(HttpStatus.NOT_FOUND.toString());
        response.setTimestamp(timeStamp);
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);

    }
}
