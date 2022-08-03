package com.rama.projectmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rama.projectmanagement.model.Project;
import com.rama.projectmanagement.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	
	public Project saveProject(Project project) {
		return projectRepository.save(project);
	}

	
	public List<Project> getAllProjects(){
		return projectRepository.findAll();
	}
	
	public List<Project> getProjectsByStatus(String status){
		return projectRepository.findByStatus(status);
	}
}
