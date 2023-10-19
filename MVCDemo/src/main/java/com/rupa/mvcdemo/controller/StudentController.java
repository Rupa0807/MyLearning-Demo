package com.rupa.mvcdemo.controller;

import com.rupa.mvcdemo.Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/form")
    public String ShowForm(Model model) {
        Student student = new Student();
        model.addAttribute("stud", student);

        return "student-form";
    }


    @RequestMapping("/processStudent")
    public String ShowForm(@ModelAttribute("Stud") Student s, Model model) {
        String s1 = s.getFirstname()+" "+s.getLastname();
        System.out.println("student name is :"+ s1 +s.getStudentID());
        model.addAttribute("s1",s1);
        model.addAttribute("s",s);

        return "processStudent";
    }
}