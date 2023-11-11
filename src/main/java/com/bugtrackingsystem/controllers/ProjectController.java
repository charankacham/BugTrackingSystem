package com.bugtrackingsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bugtrackingsystem.dto.BasicDTO;
import com.bugtrackingsystem.entity.Project;
import com.bugtrackingsystem.serviceimplementation.IProjectServiceImplementation;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    IProjectServiceImplementation iProjectServiceImplementation;

    @SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping("/create")
    public ResponseEntity<BasicDTO<Project>> createProject(@RequestBody Project project){
        return new ResponseEntity(new BasicDTO<>(iProjectServiceImplementation.createProject(project)), HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<BasicDTO<List<Project>>> allProjects(){
        return ResponseEntity.ok(new BasicDTO<>(iProjectServiceImplementation.getAllProjects()));
    }
}
