package com.ust.project_info.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ProjectDto {
    private long projectId;
    @NotNull(message = "project name can not be null")
    private String projectName;
    @NotNull(message = "project description can not be null")
    @Size(min=10,max=500,message = "project descriptin must be between 10 and 500 char")
    private String projectDescription;
    @NotBlank(message = "project manager can not be blank")
    private String projectManager;
    @Min(value=2,message = "Team members must be atleast 1")
    @Max(value=100, message = "Team members can not be more than 100")
    private int teamMumbers;
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    private String projectBudget;
    private String companyName;
    private long ccode;
}
