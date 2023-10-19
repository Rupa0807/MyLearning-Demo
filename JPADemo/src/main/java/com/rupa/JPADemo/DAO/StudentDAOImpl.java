package com.rupa.JPADemo.DAO;

import com.rupa.JPADemo.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager em;
@Autowired
    public StudentDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void DeleteAll() {
    int i= em.createQuery("Delete from Student where firstName='AAA'").executeUpdate();
        System.out.println("row count ="+i);

    }

    @Override
    @Transactional//SPring Transactional
    public void Save(Student s) {
      em.persist(s);
    }

    @Override
    public Student findById(Long Id) {
       return em.find(Student.class,Id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> allStudent= em.createQuery("from Student order by Id asc ",
                Student.class);
        return allStudent.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
     TypedQuery studentByLastName= em.createQuery("from Student where lastName=:lastName order by Id desc",Student.class);
     studentByLastName.setParameter("lastName",lastName);
        return studentByLastName.getResultList();
    }

    @Override
    @Transactional
    public void Update(Student s) {
    em.merge(s);

    }

    @Override
    @Transactional
    public void UpdateAll(List<Student> s) {
        em.createQuery("update Student set lastName='TEST'").executeUpdate();
    }

    @Override
    @Transactional
    public void DeleteStudent(Long s) {
        Student stud = em.find(Student.class,s);
        em.remove(stud);
    }
}
