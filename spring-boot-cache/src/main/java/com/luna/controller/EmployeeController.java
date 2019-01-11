package com.luna.controller;

import com.luna.bean.Employee;
import com.luna.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li
 * @date 2019-01-10-21:09
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/emp/{id}")
    public Employee  getEmployee(@PathVariable("id") Integer id){
      return employeeService.getEmp(id);
    }
}
