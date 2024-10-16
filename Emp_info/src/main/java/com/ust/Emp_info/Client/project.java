package com.ust.Emp_info.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class project {
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
