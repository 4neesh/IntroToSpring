package com.aneesh.springdemo.crud.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aneesh.springdemo.crud.demo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired 
	public EmployeeDAOJpaImpl(EntityManager entityManagerImpl){
		entityManager = entityManagerImpl;
	}
	
	//no need for @transactional. managed at service level
	@Override
	public List<Employee> findAll() {
		TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
		
		List<Employee> employees = theQuery.getResultList();
		
		
		return employees;
	}

	@Override
	public Employee findEmployee(int id) {
		
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
		
		Query theQuery = entityManager.createQuery("delete from Employee where id=:employeeId");
		
		theQuery.setParameter("employeeId",  id);
		theQuery.executeUpdate();
	}

	@Override
	public void saveEmployee(Employee employee) {
		Employee theEmployee = entityManager.merge(employee);
		employee.setId(theEmployee.getId()); //in case you are creating new one
	}

}
