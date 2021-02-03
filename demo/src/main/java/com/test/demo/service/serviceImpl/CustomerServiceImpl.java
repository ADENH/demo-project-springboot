package com.test.demo.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.io.request.customerReq;
import com.test.demo.model.Customer;
import com.test.demo.respository.CustomerRepository;
import com.test.demo.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer saveDataCustomer(customerReq req) {
		Customer cust = new Customer();
		cust.setUsername(req.getUsername());
		cust.setEmail(req.getEmail());
		cust.setFirstName(req.getFirstName());
		cust.setLastName(req.getLastName());
		cust.setPassword(req.getPassword());
		return customerRepository.save(cust);
	}

	@Override
	public Customer updateDataCustomer(int id, customerReq req) {
		Customer cust = customerRepository.findById(id).orElse(null);
		if(cust.getId() != null) {
			cust.setUsername(req.getUsername());
			cust.setEmail(req.getEmail());
			cust.setFirstName(req.getFirstName());
			cust.setLastName(req.getLastName());
			cust.setPassword(req.getPassword());
		}
		return customerRepository.save(cust);
	}

	@Override
	public Iterable<Customer> getAllDataCustomer() {
		return customerRepository.findAll();
	}

}
