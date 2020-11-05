package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;

import java.util.List;

/**
 * 接口和Mapper绑定
 */
public interface EmployeeMapper {
    public Employee getEmpById(Integer i);

    List<Employee> getEmps();
}
