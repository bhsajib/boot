package com.spring.boot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Product_Sell;
import com.spring.boot.myexception.ErrorStatusMsg;
import com.spring.boot.myexception.SaveMsg;
import com.spring.boot.service.SellService;

import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("/sell")
public class SellController {
	
	@Autowired
	SellService selsrv;
	
	@RequestMapping(value = "/prodsell/{id}",method =RequestMethod.GET )
	public ResponseEntity<?> SaveProduct(@PathVariable("id") int id){
		
		Optional<Product_Sell> response=selsrv.getsell(id);
		if(response.isPresent()) {
		return new ResponseEntity<>(response.get(), HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<ErrorStatusMsg>(new ErrorStatusMsg(404,"Data not found"), HttpStatus.valueOf(404));	
		}
		
		
	}
	
	@RequestMapping(value = "/prodsell",method =RequestMethod.POST )
	public ResponseEntity<?> SaveProduct(@RequestBody Product_Sell ps){
		
		selsrv.saveSell(ps);
		return new ResponseEntity<SaveMsg>(new SaveMsg(200, "saved successfully"), HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value = "/prodsell",method = RequestMethod.PUT )
	public ResponseEntity<?> updateProd(@RequestBody Product_Sell p){
		Optional<Product_Sell> px=selsrv.updatePro(p);
		if(px.isPresent()) {
			return new ResponseEntity<>(px.get(),HttpStatus.valueOf(200));
		}
		else {
			return new ResponseEntity<>("value is missing", HttpStatus.BAD_REQUEST);
		}
	}

}
