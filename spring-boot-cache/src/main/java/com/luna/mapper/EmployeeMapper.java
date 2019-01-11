package com.luna.mapper;

import com.luna.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author li
 * @date 2019-01-10-20:47
 */
@Mapper
public interface EmployeeMapper {
    @Select("SELECT * FROM  employee WHERE id=#{id}")
    public Employee  getEmpById(Integer id);
    @Update("UPDATE employee SET lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} " +
            "WHERE id=#{id}")
    public void updateEmp(Employee e);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    public void deleteEmpById(Integer id);
    @Insert("INSERT INTO employee(lastName,email,gender,d_id)" +
            "VALUES(#{lastName},#{email},#{gender},#{dId})")
    public void insertUser(Employee employee);
}
