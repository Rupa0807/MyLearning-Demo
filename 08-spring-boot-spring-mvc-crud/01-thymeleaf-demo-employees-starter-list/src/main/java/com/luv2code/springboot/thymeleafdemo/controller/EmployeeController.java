package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	EmployeeService employeeService;

	// load employee data
  @Autowired
  public EmployeeController(com.luv2code.springboot.thymeleafdemo.service.EmployeeService employeeService) {
	  this.employeeService = employeeService;
  }

	private List<Employee> theEmployees;

	@PostConstruct
	private void loadData() {

		System.out.println("Inside Employee post contruct");
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
//adding the employee object list into model attribute to be used in the
		// add to the spring model
		theEmployees=employeeService.findAll();
		theModel.addAttribute("employees", theEmployees);
		return "list-employees";
	}

//1. Get data
@GetMapping("/addForm")
public String CreateEmployees(Model model) {
//whenever you create a new form , create an empty object and pass into the model attribute
	Employee emp= new Employee();
        model.addAttribute("employee",emp);
	return "addForm";
}
//2. Add Data
@PostMapping("/save")
public String saveEmployees(@Valid  @ModelAttribute("employee") Employee e, BindingResult binding) {

	if (binding.hasErrors()){
		System.out.println("error :"+ binding.toString());
		return "addForm";
	}
	employeeService.save(e);
	return "redirect:/employees/list";
}
//3. Update Data
@GetMapping("/updateForm/{id}" )
public String updateEmployees(@PathVariable("id") int id , Model model) {

	System.out.println("Inside uodate controller method");
	Employee e= employeeService.findById(id);
	model.addAttribute("employee",e);
	return "addForm";
}


	@GetMapping("/delete/{id}" )
	public String deleteEmployees(@PathVariable("id") int id , Model model) {

		System.out.println("Inside Delete controller method");
		employeeService.deleteById(id);
		return "redirect:/employees/list";
	}
}









