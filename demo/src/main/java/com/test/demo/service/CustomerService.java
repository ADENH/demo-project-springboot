package com.test.demo.service;

import com.test.demo.io.request.customerReq;
import com.test.demo.model.Customer;

public interface CustomerService {
	Customer saveDataCustomer(customerReq req);
	Customer updateDataCustomer(int id, customerReq req);
	Iterable<Customer> getAllDataCustomer();
}
