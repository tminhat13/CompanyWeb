package com.tminhat.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tminhat.main.model.Department;
import com.tminhat.main.repository.DepartmentRepository;

@Controller
public class DepartmentController {
	@Autowired
	DepartmentRepository depRepo;
	@GetMapping("/departments")
	public ModelAndView getDepartments() {
		List<Department> departments = depRepo.findAll();
		return new ModelAndView("Departments","departments",departments);
	}
	
	@GetMapping("/addDepartment")
	public ModelAndView getForm() {
		return new ModelAndView("AddDepartment","department", new Department());
	}
	
	@PostMapping("/departmentregister")
	public String postDepartment(@ModelAttribute("department") Department newDept) {
		try {
			depRepo.save(newDept);
			return "success";
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return "ErrorAlert";
	}
}
