package com.capg.mtb.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.mtb.exceptions.CustomerNotFoundException;
import com.capg.mtb.model.Customer;
import com.capg.mtb.model.Movie;
import com.capg.mtb.service.ICustomerService;
@RestController
public class CustomerController {
	
	@Autowired
	ICustomerService iCustomerService;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		return ResponseEntity.ok(iCustomerService.addCustomer(customer));
	}
	
	@PostMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) throws CustomerNotFoundException{
		return ResponseEntity.ok(iCustomerService.updateCustomer(customer));
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int userId) throws CustomerNotFoundException {
		return iCustomerService.deleteCustomer(userId);
	}
	
	@GetMapping("/viewbyId/{id}")
	public Customer viewCustomer(@PathVariable("id") int id) throws CustomerNotFoundException {
		Customer customer=iCustomerService.viewCustomer(id);
		return customer;
		
	}
	@GetMapping("/viewbyMovieId/{id}")
	public List<Customer> viewAllCustomers(@PathVariable("id") int id)throws CustomerNotFoundException{
		List<Customer> customer=iCustomerService.viewAllCustomers(id);
		return customer;
	}

}
