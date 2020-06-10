package com.aneesh.springdemo.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aneesh.springdemo.crud.demo.dao.EmployeeDAO;
import com.aneesh.springdemo.crud.demo.dao.EmployeeRepository;
import com.aneesh.springdemo.crud.demo.entity.Employee;
//
//@Service
//public class EmployeeServiceImp implements EmployeeService {

//remove comments below to use employeeDAO with JPA-Hibernate implementation
	
//private EmployeeDAO employeeDao;
//@Autowired
//public EmployeeServiceImp(@Qualifier("employeeJpaImpl") EmployeeDAO theEmployeeDao) {
//	employeeDao = theEmployeeDao;		
//}

	
//	@Override
//	@Transactional
//	public List<Employee> findAll() {
//		return employeeDao.findAll();
//	}
//
//	@Override
//	@Transactional
//	public Employee findEmployee(int id) {
//		return employeeDao.findEmployee(id);
//	}
//
//	@Override
//	@Transactional
//	public void saveEmployee(Employee employee) {
//		employeeDao.saveEmployee(employee);
//
//	}
//
//	@Override
//	@Transactional
//	public void deleteEmployee(int id) {
//		 employeeDao.deleteEmployee(id);
//
//	}
//
//	
	
	//uncomment to allow use of JPS. currently using Spring data rest
	
//	
//private EmployeeRepository employeeRepository;
//	
//@Autowired
//public EmployeeServiceImp(EmployeeRepository theEmployeeRepository) {
//	employeeRepository = theEmployeeRepository;		
//}
//	
//	//no need for @transactional as employeeRepository provides it
//	
//	@Override
//	public List<Employee> findAll() {
//		return employeeRepository.findAll();
//	}
//
//	@Override
//	public Employee findEmployee(int id) {
//		
//		Optional<Employee> result = employeeRepository.findById(id);
//		Employee theEmployee = null;
//		if(result.isPresent()) {
//			theEmployee = result.get();
//			}
//		else {
//			throw new RuntimeException("Did not find employee id - " + id);
//		}
//		return theEmployee;
//	}
//
//	@Override
//	public void saveEmployee(Employee employee) {
//		employeeRepository.save(employee);
//
//	}
//
//	@Override
//	public void deleteEmployee(int id) {
//		employeeRepository.deleteById(id);
//
//	}

//}
