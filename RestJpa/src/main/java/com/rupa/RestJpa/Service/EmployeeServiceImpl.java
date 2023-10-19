package com.rupa.RestJpa.Service;

import com.rupa.RestJpa.Dao.EmployeeDAO;
import com.rupa.RestJpa.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO emp;
@Autowired
    public EmployeeServiceImpl(EmployeeDAO emp) {
        this.emp = emp;
    }

    @Override
    public List<Employee> getAllEmployee() {
      return emp.getAllEmployee();
    }

    public Employee findById(Long Id) {
        return emp.findById(Id);

}

    @Transactional
    @Override
    public Employee save1(Employee e) {
        return  emp.save(e);
    }

   @Transactional
   @Override
    public Employee save(Employee e) {
      return  emp.save(e);
    }

    @Override @Transactional
    public void deleteEmployee(Employee e) {

        emp.deleteEmployee(e);

    }

}
