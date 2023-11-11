package com.bugtrackingsystem.services;


import org.springframework.stereotype.Service;

import com.bugtrackingsystem.models.Project;
import com.bugtrackingsystem.models.TestEngineer;

import java.util.List;
@Service
public interface ITestEngineerService {

	TestEngineer addTestEngineer(TestEngineer testEngineer);

	TestEngineer updateTestEngineer(TestEngineer testEngineer);

	TestEngineer getTestEngById(Long testerId);

	List<TestEngineer> getAllTesters();

	Project getProjectByTestEngId(Long testEngId);

}
