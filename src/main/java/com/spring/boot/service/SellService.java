package com.spring.boot.service;

import java.util.Optional;

import com.spring.boot.entity.Product_Sell;

public interface SellService {

	public  Optional<Product_Sell> getsell(int ps);
	public Product_Sell saveSell(Product_Sell ps);
	public Optional<Product_Sell> updatePro(Product_Sell ps);
}
