package com.rama.projectmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rama.projectmanagement.model.Employee;
import com.rama.projectmanagement.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/")
	public String showAllEmployees() {
		return null;
	}
	
	@GetMapping("/new")
	public String displayEmployeeForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "employee/new-employee";
	}
	
	@PostMapping("/save")
	public String createNewEmployee(Employee employee) {
		empService.save(employee);
		return "redirect:/employees/new";
		
	}
	

}
