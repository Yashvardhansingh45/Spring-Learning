package com.example.springconcepts.bean;

import com.example.springconcepts.bean.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logger")
public class DiControler{

    @Autowired
    private ApplicationContext context;

    @GetMapping("/employee")
    public String getEmployeeDetails() {
        EmployeeBean employee = context.getBean(EmployeeBean.class);
        return employee.getEmployeeDetails();
    }
}
