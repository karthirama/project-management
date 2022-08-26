package com.rama.projectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rama.projectmanagement.model.Project;
import com.rama.projectmanagement.service.ProjectService;

@Controller
@RequestMapping("/projects")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@PostMapping("/createproject")
	public String saveProject(Project project) {
		projectService.saveProject(project);
		return "redirect:/projects/new";
	}

	@GetMapping("/new")
	public String displayNewProject(Model model) {
		model.addAttribute("project", new Project());
		return "project/new-project";
	}

	@GetMapping()
	public String showAllProject(Model model) {
		List<Project> projects = projectService.getAllProjects();
		model.addAttribute("projects", projects);
		return "project/list-projects";
	}

	@GetMapping("/showprojectsbystatus")
	public List<Project> showProjectsByStatus(String status) {
		return projectService.getProjectsByStatus(status);
	}

}
