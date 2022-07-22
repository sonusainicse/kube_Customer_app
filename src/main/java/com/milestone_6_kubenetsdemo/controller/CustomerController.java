package com.milestone_6_kubenetsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.milestone_6_kubenetsdemo.model.Customer;
import com.milestone_6_kubenetsdemo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService cs;

	public CustomerController(CustomerService cs) {
		super();
		this.cs = cs;
	}
	
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return this.cs.getAllCustomers();
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable("id") String id) {
		return this.cs.getCustomerById(Long.parseLong(id));
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> saveEmployee(@RequestBody Customer cus){
		return new ResponseEntity<Customer>(cs.saveCustomer(cus),HttpStatus.CREATED);
	}
		
		@DeleteMapping("/customers/{id}")
		public ResponseEntity<HttpStatus> deleteCustomerById(@PathVariable String id) {
			try {
				this.cs.deleteCustomerById(Long.parseLong(id));
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		
	}
	
}
