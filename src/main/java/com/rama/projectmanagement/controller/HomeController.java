package com.rama.projectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rama.projectmanagement.model.Employee;
import com.rama.projectmanagement.model.Project;
import com.rama.projectmanagement.service.EmployeeService;
import com.rama.projectmanagement.service.ProjectService;

@Controller
public class HomeController {
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/")
	public String displayHomePage(Model model) {
		
		List<Project> projects = projectService.getAllProjects();
		model.addAttribute("projectsList",projects);
		
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("employeesListProjectsCnt",employees);

		return "home";
	}
	
}
