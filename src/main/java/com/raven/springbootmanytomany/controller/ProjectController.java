package com.raven.springbootmanytomany.controller;

import com.raven.springbootmanytomany.entity.Project;
import com.raven.springbootmanytomany.repository.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private ProjectRepository projectRepository;

    @PostMapping("/saveProject")
    public String saveProject(@RequestBody Project entity) {
        System.out.println("Project save called...");

        // new Project
        Project project = new Project(entity.getProjectName(), entity.getTechnologyUsed());

        // save Project
        project = projectRepository.save(project);
        System.out.println("Saved Project :: " + project);
        return "Project saved!!!";
    }
}
