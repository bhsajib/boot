package com.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Customer;
import com.spring.boot.myexception.CoustomerException;
import com.spring.boot.repo.Repo;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	Repo repo;
	@Override
	public List<Customer> getAll() {
		//return repo.findAll();
		return repo.getAllCust();
	}
	@Override
	public Optional<Customer> UserById(Integer id) {
		try {
			if(id>=3) {
				throw new CoustomerException(600, "No user found", null);
			}
		return repo.findById(id);
		}
		 catch (Exception e) {
			 throw new CoustomerException(700, "Error", null);
		}
	}
	@Override
	public List<Customer> saveUSer(Customer cust) {
		repo.save(cust);
		return repo.findAll();
	}
	@Override
	public Customer UpdateUser(Customer cust) {
		repo.save(cust);
		return repo.findById(cust.getId()).get();
	}
	@Override
	public List<Customer> deleteUser(Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}
	@Override
	public Optional<Customer> UserByName(String name) {
		
		return  repo.findByname(name);
	}
	
}
