package com.rama.projectmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rama.projectmanagement.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
	
	List<Project> findByStatus(String status);

}
