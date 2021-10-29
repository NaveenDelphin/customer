package com.sfdatabase.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sfdatabase.demo.model.CustomerDetails;
import com.sfdatabase.demo.repository.CustomerRepository;

import javax.validation.Valid;

@RestController
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@CrossOrigin
	@PostMapping("/customer")
	public CustomerDetails addCustomer(@Valid @RequestBody CustomerDetails customerdetails) {
		CustomerDetails customer1 = customerRepository.save(customerdetails);
		return customer1;
	}
	@CrossOrigin
	@GetMapping("/customer")
	public Page<CustomerDetails> listCustomers(Pageable pageable){
		return customerRepository.findAll(pageable);
	}
	@CrossOrigin
	@GetMapping("/customer/{id}")
	public CustomerDetails getByapplicationid(@PathVariable Long applicationid) {
		CustomerDetails customer = customerRepository.getOne(applicationid);
		return customer;
	}
}
