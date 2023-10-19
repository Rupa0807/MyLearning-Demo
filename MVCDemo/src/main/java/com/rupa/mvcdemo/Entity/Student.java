package com.rupa.mvcdemo.Entity;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.HashMap;
import java.util.Map;

public class Student {

@NotNull(message ="value required")
@Size(min=1)
    private String firstname;
    private String lastname;
    private int studentID;
    private String department;
    private String gender;
    private String language;
    private Map<String,String> languagelist;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Map<String, String> getLanguagelist() {
        return languagelist;
    }

    public void setLanguagelist(Map<String, String> languagelist) {
        this.languagelist = languagelist;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartmentlist() {
        return departmentlist;
    }

    public void setDepartmentlist(Map<String, String> departmentlist) {
        this.departmentlist = departmentlist;
    }

    private Map<String,String> departmentlist;





    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String country;

    public Student() {
        departmentlist=new HashMap<>();
        departmentlist.put("ECE","ECE");
        departmentlist.put("CSE","CSE");
        departmentlist.put("Civil","Civil");
        departmentlist.put("Mech","Mech");



        languagelist=new HashMap<>();
        languagelist.put("Java","Java");  languagelist.put("C++","C++");
        languagelist.put("JavaScript","JavaScript");
        languagelist.put("PHP","PHP");
        languagelist.put("SQL","SQL");



    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Student(String firstname, String lastname, int studentID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentID = studentID;
    }
}
