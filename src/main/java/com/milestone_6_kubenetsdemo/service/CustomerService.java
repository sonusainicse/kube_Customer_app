package com.milestone_6_kubenetsdemo.service;

import java.util.List;

import com.milestone_6_kubenetsdemo.model.Customer;


public interface CustomerService {
	
	Customer saveCustomer(Customer cus);
	
	List<Customer> getAllCustomers();
	
	Customer getCustomerById(long id);
	
	void deleteCustomerById(long id);

}
