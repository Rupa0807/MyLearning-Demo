package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {

	List<Employee> findAll();
	//Adding Pagination

	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	Page<Employee> addPages(int pageNo, int pageSize);
	
}
