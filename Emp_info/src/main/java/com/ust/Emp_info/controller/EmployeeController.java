package com.ust.Emp_info.controller;

import com.ust.Emp_info.Client.FullResponse;
import com.ust.Emp_info.Model.Employee;
import com.ust.Emp_info.service.EmployeeService;
//import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/ustemps")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public Employee addEmployee(@org.springframework.web.bind.annotation.RequestBody  Employee employee){
        return employeeService.addEmployee(employee);
    }
    @GetMapping("withprojects/{ccode}")
    public ResponseEntity<FullResponse> getEmployeesByCcode(@PathVariable("ccode") long empId){
        return ResponseEntity.ok(employeeService.getEmployeesByProjectCcode(empId));
    }

}
