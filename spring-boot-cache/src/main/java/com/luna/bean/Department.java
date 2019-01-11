package com.luna.bean;

/**
 * @author li
 * @date 2019-01-10-20:40
 */
public class Department {
    private Integer id;
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department='" + department + '\'' +
                '}';
    }

    public Department(Integer id, String department) {

        this.id = id;
        this.department = department;
    }
}
