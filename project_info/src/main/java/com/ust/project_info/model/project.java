package com.ust.project_info.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class project {
    @Id
    private long projectId;
    private String projectName;
    private String projectDescription;
    private String projectManager;
    private int teamMumbers;
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    private String projectBudget;
    private String companyName;
    private long ccode;

}
