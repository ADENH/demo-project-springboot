package com.test.demo.respository;

import org.springframework.data.repository.CrudRepository;

import com.test.demo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
