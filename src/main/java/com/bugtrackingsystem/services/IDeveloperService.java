package com.bugtrackingsystem.services;



import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.DeveloperDTO;
import com.bugtrackingsystem.models.Developer;
import com.bugtrackingsystem.models.Project;

import java.util.List;

@Service
public interface IDeveloperService {
	Developer addDeveloper(DeveloperDTO developer);

	Developer updateDeveloper(DeveloperDTO developer,Long developerId);

	Developer getDeveloperById(Long devId);

	List<Developer> getAllDevelopers();

	Project getProjectByDevId(Long devId);
}
