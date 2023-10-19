package com.rupa.RestJpa.Service;

import com.rupa.RestJpa.Dao.EmployeeRepository;
import com.rupa.RestJpa.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository emp;
@Autowired
    public EmployeeServiceImpl(EmployeeRepository emp) {
        this.emp = emp;
    }

    @Override
    public List<Employee> getAllEmployee() {
      return emp.findAll();
    }

    public Employee findById(Long Id) {

         Optional<Employee> Employee =emp.findById(Id);
         if(Employee.isEmpty()){
             throw new RuntimeException("Employee Not found");
         }
                return Employee.get();


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

        emp.delete(e);

    }

}
