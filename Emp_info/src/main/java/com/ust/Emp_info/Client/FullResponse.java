package com.ust.Emp_info.Client;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FullResponse {
    private long ccode;
    private long empId;
    private String empName;
    private String empEmail;
    private String empContact;
    private String empDept;
    private String empDesg;
    private int empExp;

    private List<project> projectList;
}
