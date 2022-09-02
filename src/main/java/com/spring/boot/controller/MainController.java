package com.spring.boot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.boot.entity.Customer;
import com.spring.boot.service.CustomerService;

@RestController
@RequestMapping("/bootproject")
public class MainController {
	
	@Autowired
	CustomerService custsrv;

	@GetMapping("/getall")
	public ResponseEntity<String> getName() {
		//new ResponseEntity<>("helloo",HttpStatus.OK);
		//return new ResponseEntity<>("helloo",HttpStatus.OK);
		
		return new ResponseEntity<>("helloo",HttpStatus.OK);
	}
	
	@GetMapping("/coustomer")
	public ResponseEntity<List<Customer>> getAllCust(){
		return new ResponseEntity<>(custsrv.getAll(),HttpStatus.OK);
	}

/*	@GetMapping("/coustomer/{id}")
	public ResponseEntity<?> User(@PathVariable("id") Integer id){
		if(custsrv.UserById(id).isPresent()) {
			return new ResponseEntity<>(custsrv.UserById(id).get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Data not found",HttpStatus.NOT_FOUND);
		}
		
		
	} */
	
	@GetMapping("/coustomer/{name}")
	public ResponseEntity<?> User(@PathVariable("name") String name){
		     if(custsrv.UserByName(name).isPresent()) {
			return new ResponseEntity<>(custsrv.UserByName(name).get(),HttpStatus.OK);
		     }
		     else {
					return new ResponseEntity<>("Data not found",HttpStatus.NOT_FOUND);
				}
		
	}
	@PostMapping("/coustomer")
	public List<Customer> saveUser(@RequestBody Customer cust ){
		
		return custsrv.saveUSer(cust);
	}
	
	@PutMapping("/coustomer")
	public Customer updateUser(@RequestBody Customer cust ){
		
		return custsrv.UpdateUser(cust);
	}
	
	@DeleteMapping("/coustomer/{userid}")
	public List<Customer> deleteUser(@PathVariable("userid") Integer userid){
		
		return custsrv.deleteUser(userid);
	}
	
	
}
