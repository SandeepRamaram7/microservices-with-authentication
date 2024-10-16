package com.ust.project_info.controller;

import com.ust.project_info.DTO.ProjectDto;
import com.ust.project_info.model.project;
import com.ust.project_info.service.ProjectService;
//import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired

    private ProjectService projectService;
    @PostMapping("/addproject")
    public ResponseEntity<project> addProject(@org.springframework.web.bind.annotation.RequestBody ProjectDto project){
        return new ResponseEntity<>(projectService.addProject(project), HttpStatus.CREATED);
    }
    @GetMapping("/project/{ccode}")
    public ResponseEntity<List<project>> getProjectByCcode(@PathVariable long ccode){
        return new ResponseEntity<>(projectService.getProjectByCcode(ccode),HttpStatus.CREATED);
    }
}
