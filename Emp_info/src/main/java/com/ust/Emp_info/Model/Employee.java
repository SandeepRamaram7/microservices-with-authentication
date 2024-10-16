package com.ust.Emp_info.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;
    private String empName;
    private String empEmail;
    private String empContact;
    private String empDept;
    private String empDesg;
    private int empExp;
    private long ccode;

    public long getCcode() {
        return ccode;
    }

    public void setCcode(long ccode) {
        this.ccode = ccode;
    }

    public Employee() {
    }

    public Employee(String empName, long empId, String empEmail, String empContact, String empDept, String empDesg, int empExp, long ccode) {
        this.empName = empName;
        this.empId = empId;
        this.empEmail = empEmail;
        this.empContact = empContact;
        this.empDept = empDept;
        this.empDesg = empDesg;
        this.empExp = empExp;
        this.ccode = ccode;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpContact() {
        return empContact;
    }

    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpDesg() {
        return empDesg;
    }

    public void setEmpDesg(String empDesg) {
        this.empDesg = empDesg;
    }

    public int getEmpExp() {
        return empExp;
    }

    public void setEmpExp(int empExp) {
        this.empExp = empExp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empContact='" + empContact + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empDesg='" + empDesg + '\'' +
                ", empExp=" + empExp +
                '}';
    }
}
