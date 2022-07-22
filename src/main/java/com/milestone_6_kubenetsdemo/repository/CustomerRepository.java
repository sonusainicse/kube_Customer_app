package com.milestone_6_kubenetsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milestone_6_kubenetsdemo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
