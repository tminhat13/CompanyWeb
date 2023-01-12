package com.tminhat.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tminhat.main.model.Employee;
import com.tminhat.main.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping("/employees")
	public ModelAndView getEmployees() {
		List<Employee> employees = empRepo.findAll();
		return new ModelAndView("Employees","employees",employees);
	}
	
	@GetMapping("/employees/{name}")
	public ModelAndView getData(@PathVariable("name") String itemname) {
		List<Employee> employees = empRepo.findByEmpName(itemname);
		return new ModelAndView("EmployeeDetails","data",employees.get(0));
	}
	
	@GetMapping("/addEmployee")
	public ModelAndView getForm() {
		return new ModelAndView("AddEmployee","employee",new Employee());
	}
	
	@PostMapping("/employeeregister")
	public String postData(@ModelAttribute("Employee") Employee data) {
		try {
			empRepo.save(data);
			return "success";
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return "ErrorAlert";
	}
}
