package com.rupa.RestJpa.Dao;

import com.rupa.RestJpa.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployee();
    Employee findById(Long Id);

    Employee save(Employee e);

    void deleteEmployee(Employee e);
}
