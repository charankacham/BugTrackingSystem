package com.bugtrackingsystem.services;



import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.ProjectDTO;
import com.bugtrackingsystem.models.Developer;
import com.bugtrackingsystem.models.Project;
import com.bugtrackingsystem.models.TestEngineer;

import java.util.List;
@Service
public interface IProjectService {

	Project createProject(Project projDTO);

	Project getProjectById(Long projId);

	List<Project> getAllProjects();

	Project updateProject(Project projDTO);

	List<Developer> getDevelopersByProjectId(Long projId);

	List<TestEngineer> getTestEngineersByProjectId(Long projId);

}
