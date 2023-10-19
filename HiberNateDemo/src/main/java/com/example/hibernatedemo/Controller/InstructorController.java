package com.example.hibernatedemo.Controller;

import com.example.hibernatedemo.Entity.Instructor;
import com.example.hibernatedemo.Repository.InstructorRepository;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstructorController {


    InstructorRepository instructorRepository;

    @Autowired
    public InstructorController(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    Environment

    @GetMapping("/instructors")
    public List<Instructor> getInstructor( ) {
        return instructorRepository.findAll();
    }


    @DeleteMapping("/instructors/{id}")
    public void DeleteInstructor( @PathVariable(name="id") Long id) {
       instructorRepository.deleteById(id.intValue());
    }

    @PostMapping("/instructors")
    public Instructor createUser( @RequestBody Instructor instructor) {
        return instructorRepository.save(instructor);
    }

}

