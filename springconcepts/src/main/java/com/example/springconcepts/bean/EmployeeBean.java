package com.example.springconcepts.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "John Doe";

    @Autowired
    private DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee: " + name + ", Department: " + department.getDeptName();
    }
}

