package com.spring.boot.output;

import java.math.BigDecimal;

public class EmpCust {

	private int id;
	private String email;
	private BigDecimal price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public EmpCust(int id, String email, BigDecimal price) {
		this.id = id;
		this.email = email;
		this.price = price;
	}
	
}
