package com.spring.boot.repo;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.boot.entity.Product_Sell;

public interface Sellrepo extends JpaRepository<Product_Sell, Integer> {
	
	@Query("SELECT c from Product_Sell c where c.cust_id = :id")
	public Optional<Product_Sell> userId(@Param("id") int uid);
	
	@Query("SELECT c from Product_Sell c where c.cust_id = :id")
	public Optional<Object> customUser(@Param("id") int uid);
	
	
}
