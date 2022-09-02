package com.spring.boot.service;

import java.util.List;
import java.util.Optional;

import com.spring.boot.entity.Customer;

public interface CustomerService {
	
public List<Customer> getAll();
public Optional<Customer> UserById(Integer id);
public List<Customer> saveUSer(Customer cust);
public Customer UpdateUser(Customer cust);
public List<Customer> deleteUser(Integer id);
public Optional<Customer> UserByName(String name);
}
