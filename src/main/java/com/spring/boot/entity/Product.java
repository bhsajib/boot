package com.spring.boot.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String prod_name;
	private BigDecimal prod_price;
	private int prod_qnty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public BigDecimal getProd_price() {
		return prod_price;
	}
	public void setProd_price(BigDecimal prod_price) {
		this.prod_price = prod_price;
	}
	public int getProd_qnty() {
		return prod_qnty;
	}
	public void setProd_qnty(int prod_qnty) {
		this.prod_qnty = prod_qnty;
	}
	

}
