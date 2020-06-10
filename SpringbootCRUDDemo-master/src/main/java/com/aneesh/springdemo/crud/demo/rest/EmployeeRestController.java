package com.aneesh.springdemo.crud.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aneesh.springdemo.crud.demo.entity.Employee;
import com.aneesh.springdemo.crud.demo.service.EmployeeService;

//this class will use the Employee DAO to talk with hibernate
//uncomment to stop using spring data rest
//
//@RestController
//@RequestMapping("/api")
//public class EmployeeRestController {
//
//	
//	//inject the employee dao
//	private EmployeeService employeeService;
//	
//	@Autowired
//	public EmployeeRestController(EmployeeService theEmployeeService) {
//		employeeService = theEmployeeService;		
//	}
//	
//	@GetMapping("/employees")
//	public List<Employee> findAll(){
//		return employeeService.findAll();
//	}
//	
//	@GetMapping("/employees/{id}")
//	public Employee findEmployee(@PathVariable int id) {
//		Employee tempEmployee = employeeService.findEmployee(id);
//		
//		if (tempEmployee == null) {
//			throw new RuntimeException("Employee if not found: " + id);
//			
//		}
//		return tempEmployee;
//	}
//	
//	//add mapping for post employees
//	@PostMapping("/employees")
//	public Employee addEmployee(@RequestBody Employee employee) {
//		
//		//set id to 0 in case one is specified
//		employee.setId(0);
//		employeeService.saveEmployee(employee);
//		
//		return employee;
//	}
//	
//	@PutMapping("/employees")
//	public Employee updateEmployee(@RequestBody Employee employee) {
//		
//		employeeService.saveEmployee(employee);
//		return employee;
//		
//	}
//	
//	@DeleteMapping("/employees/{id}")
//	public String deleteEmployee(@PathVariable int id) {
//		
//		Employee tempEmployee = employeeService.findEmployee(id);
//		if (tempEmployee == null) {
//			throw new RuntimeException("Employee if not found: " + id);
//			
//		}
//		employeeService.deleteEmployee(id);
//		return "deleted employee of id: " + id;
//	}
//	
//	
//	
//	
//}
