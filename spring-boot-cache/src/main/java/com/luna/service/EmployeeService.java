package com.luna.service;

import com.luna.bean.Employee;
import com.luna.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author li
 * @date 2019-01-10-21:06
 */
@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

  @Cacheable(cacheNames = "emp",
          keyGenerator = "keyGenerator",condition = "#id>0",unless =  "#result==null")
    public Employee  getEmp(Integer id){
        System.out.println("查询"+id+"号员工");
        Employee emp = employeeMapper.getEmpById(id);
        return  emp;
    }
}
