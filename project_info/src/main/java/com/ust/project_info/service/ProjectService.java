package com.ust.project_info.service;

import com.ust.project_info.DTO.ProjectDto;
import com.ust.project_info.model.project;
import com.ust.project_info.reposetory.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    public project addProject(ProjectDto p) {
        project p1=new project();
        p1.setProjectId(p.getProjectId());
        p1.setProjectName(p.getProjectName());
        p1.setProjectDescription(p.getProjectDescription());
        p1.setProjectManager(p.getProjectManager());
        p1.setTeamMumbers(p.getTeamMumbers());
        p1.setProjectStatus(p.getProjectStatus());
        p1.setProjectStartDate(p.getProjectStartDate());
        p1.setProjectEndDate(p.getProjectEndDate());
        p1.setProjectBudget(p.getProjectBudget());
        p1.setCompanyName(p.getCompanyName());
        p1.setCcode(p.getCcode());
        return projectRepository.save(p1);
    }

    public List<project> getProjectByCcode(long ccode) {
        return projectRepository.findByCcode(ccode);
    }
}
