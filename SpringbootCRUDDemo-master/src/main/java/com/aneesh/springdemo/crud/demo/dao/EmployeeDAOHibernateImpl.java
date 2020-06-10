package com.aneesh.springdemo.crud.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aneesh.springdemo.crud.demo.entity.Employee;


@Repository //used for collection of objects
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	//define field for entityManager
	private EntityManager entityManager;
	
	
	//constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;		
	}
	
	//@Transactional //to handle the transaction session for me. Removed to use service to handle this
	@Override
	public List<Employee> findAll() {

		//get current Hibernate session
		Session currentSession = entityManager.unwrap(Session.class); //get the session with entity manager 
		
		
		//create a query
		Query<Employee> theQuery = 
				currentSession.createQuery("from Employee", Employee.class);
		
		//execute the query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		//return the results
		
		return employees;
	}

	@Override
	public Employee findEmployee(int id) {

		//get the hibernate session
		Session currentSession = entityManager.unwrap(Session.class); //get the session with entity manager 

		//get the employee
		Employee tempEmployee = 
				currentSession.get(Employee.class, id);
		return tempEmployee;
	}

	@Override
	public void deleteEmployee(int id) {
		
		//get the hibernate session
		Session currentSession = entityManager.unwrap(Session.class); //get the session with entity manager 
		
		Query query = currentSession.createQuery("delete from Employee where id=:employeeId");
		
		query.setParameter("employeeId", id);
		
		query.executeUpdate();
				
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		//get hibernate session
		Session currentSession = entityManager.unwrap(Session.class); //get the session with entity manager 

		//save employee
		currentSession.saveOrUpdate(employee);
		
	}

}
