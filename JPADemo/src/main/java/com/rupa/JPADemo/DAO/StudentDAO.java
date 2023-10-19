package com.rupa.JPADemo.DAO;

import com.rupa.JPADemo.Entity.Student;

import java.util.List;

public interface StudentDAO {

    void DeleteAll();
   void   Save(Student s);
   Student findById(Long Id);

   List<Student> findAll();

   List<Student> findByLastName(String lastName);

  void Update(Student s);

  void UpdateAll(List<Student> s);

  void DeleteStudent(Long s);
}
