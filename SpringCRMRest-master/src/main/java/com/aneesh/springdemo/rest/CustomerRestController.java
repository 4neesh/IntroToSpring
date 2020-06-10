package com.aneesh.springdemo.rest;

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

import com.aneesh.springdemo.entity.Customer;
import com.aneesh.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	//auto-wire the CustomerService for dependency injection
	@Autowired
	private CustomerService customerService;
	
	//add mapping for the GET / customers
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		
		return customerService.getCustomers();
	}
	
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		Customer selectedCustomer = customerService.getCustomer(customerId);
		
		if(selectedCustomer == null) {
			throw new CustomerNotFoundException("Customer id " + customerId + " not found.");
		}
		return selectedCustomer;
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customerToAdd) {
		//@RequestBody obtains JSON data as a POJO
		
		customerToAdd.setId(0);
		customerService.saveCustomer(customerToAdd);
		return customerToAdd;
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customerToUpdate) {
		
		customerService.saveCustomer(customerToUpdate);
		
		return customerToUpdate;
	}
	
	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		
		Customer selectedCustomer = customerService.getCustomer(customerId);
		if(selectedCustomer == null) {
			throw new CustomerNotFoundException("Customer id " + customerId + " not found.");
		}
		customerService.deleteCustomer(customerId);
		return "Deleted customer id: " + customerId;
	}
	
	
}
