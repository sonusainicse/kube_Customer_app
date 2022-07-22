package com.milestone_6_kubenetsdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.milestone_6_kubenetsdemo.model.Customer;
import com.milestone_6_kubenetsdemo.repository.CustomerRepository;
import com.milestone_6_kubenetsdemo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	
	private CustomerRepository cr;
	
	public CustomerServiceImpl(CustomerRepository cr) {
		super();
		this.cr = cr;
	}

	@Override
	public Customer saveCustomer(Customer cus) {
		return cr.save(cus);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return cr.findAll();
	}

	@Override
	public Customer getCustomerById(long id) {
		java.util.Optional<Customer> optional = cr.findById(id);
		Customer cus = null;
		if (optional.isPresent()) {
			cus = optional.get();
		} else {
			throw new RuntimeException(" Customer not found for id :: " + id);
		}
		return cus;
	}

	@Override
	public void deleteCustomerById(long id) {
		this.cr.deleteById(id);
		
	}

}
