package com.ust.Emp_info.service;

import com.ust.Emp_info.Client.FullResponse;
import com.ust.Emp_info.Client.project;
import com.ust.Emp_info.Model.Employee;
import com.ust.Emp_info.fegin.ProjectClient;
import com.ust.Emp_info.repository.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepositary employeeRepositary;

    @Autowired
    private ProjectClient projectClient;

    public Employee addEmployee(Employee employee) {
        return employeeRepositary.save(employee);
    }
    public FullResponse getEmployeesByProjectCcode(long ccode){
        Employee employee= (Employee) employeeRepositary.findByCcode(ccode).orElse(null);
        List<project> projects=projectClient.findProjectsByCcode(ccode);

        FullResponse response = new FullResponse();
        assert employee != null;
        response.setEmpName(employee.getEmpName());
        response.setEmpId(employee.getEmpId());
        response.setEmpDept(employee.getEmpDept());
        response.setEmpDesg(employee.getEmpDesg());
        response.setCcode(employee.getCcode());
        response.setEmpEmail(employee.getEmpEmail());
        response.setEmpContact(employee.getEmpContact());



        response.setEmpExp(employee.getEmpExp());


        response.setProjectList(projects);
        return response;
        
    }

}
