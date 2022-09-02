package com.spring.boot.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.boot.entity.Customer;

public interface Repo extends JpaRepository<Customer, Integer> {
	
public Optional<Customer> findByname(String name);

@Query("select u from Customer u")
public List<Customer> getAllCust();

@Query("select u from Customer u where u.id =:userid")
public Optional<Customer> getCust(@Param("userid") Integer id);

}
