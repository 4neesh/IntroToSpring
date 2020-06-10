package com.aneesh.springdemo.crud.demo.dao;

import java.util.List;

import com.aneesh.springdemo.crud.demo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	
	public Employee findEmployee(int id);
	
	public void deleteEmployee(int id);
	
	public void saveEmployee(Employee employee);
}
