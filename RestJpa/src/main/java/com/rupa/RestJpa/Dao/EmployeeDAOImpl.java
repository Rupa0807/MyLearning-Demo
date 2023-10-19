package com.rupa.RestJpa.Dao;

import com.rupa.RestJpa.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

private EntityManager em;
@Autowired
    public EmployeeDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Employee> getAllEmployee() {
        TypedQuery<Employee> getEmployee= em.createQuery("from Employee",Employee.class);
        return getEmployee.getResultList();

    }

    @Override
    public Employee findById(Long Id) {
    return em.find(Employee.class,Id);

    }

    @Override
    public Employee save(Employee e) {
        System.out.println("Inside Save DAOImpl");
        return em.merge(e);

    }

    @Override
    public void deleteEmployee(Employee e) {
        System.out.println("******** Id= "+e.getId());
       em.remove(e);

}
}
