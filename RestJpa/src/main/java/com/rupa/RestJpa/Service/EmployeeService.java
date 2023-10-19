package com.rupa.RestJpa.Service;

import com.rupa.RestJpa.Dao.EmployeeDAO;
import com.rupa.RestJpa.Entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    Employee findById(Long Id);

    Employee save(Employee e);
    Employee save1(Employee e);

    void deleteEmployee(Employee e);
}
