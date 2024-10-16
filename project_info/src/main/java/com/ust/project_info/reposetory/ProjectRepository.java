package com.ust.project_info.reposetory;

import com.ust.project_info.model.project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<project,Long>{


    List<project> findByCcode(long ccode);
}
