package com.aneesh.springdemo.crud.demo.service;

import java.util.List;

import com.aneesh.springdemo.crud.demo.entity.Employee;

public interface EmployeeService {

	
	public List<Employee> findAll();
	
	public Employee findEmployee(int id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
	
}
