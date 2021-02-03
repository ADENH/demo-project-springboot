package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.io.request.customerReq;
import com.test.demo.model.Customer;
import com.test.demo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer saveDataCustomer(@RequestBody customerReq req) {
		return customerService.saveDataCustomer(req);
	}
	
	@PutMapping("/customer/{id}")
	public Customer updateDataCustomer(@PathVariable int id,@RequestBody customerReq req) {
		return customerService.updateDataCustomer(id, req);
	}
	
	@GetMapping("/customer")
	public Iterable<Customer> getAllDataCustomer(){
		return customerService.getAllDataCustomer();
	}
	

}
