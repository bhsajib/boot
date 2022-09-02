package com.spring.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entity.Product_Sell;
import com.spring.boot.myexception.CoustomerException;
import com.spring.boot.myexception.ErrorStatusMsg;
import com.spring.boot.repo.Sellrepo;

@Service
public class SellServiceImp implements SellService {
	@Autowired
	Sellrepo slrp;
	@Override
	public Product_Sell saveSell(Product_Sell ps) {
		Product_Sell x=slrp.save(ps);
		return x;
	}
	@Override
	public Optional<Product_Sell> getsell(int ps) {
		Optional<Product_Sell> x=slrp.userId(ps);
		//Optional<Product_Sell> x=slrp.findById(ps);
		
		return x;
	}
	@Override
	public Optional<Product_Sell> updatePro(Product_Sell ps) {
		if(slrp.findById(ps.getCust_id()).isPresent()) {
		slrp.save(ps);
		return slrp.findById(ps.getCust_id());
		}
		else {
			throw new CoustomerException(500,"Data not found",new ErrorStatusMsg(500," Data not found"));
		}
		
		
	}

}
