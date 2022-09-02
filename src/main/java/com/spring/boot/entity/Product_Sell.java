package com.spring.boot.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "product_sell")
public class Product_Sell {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_id;
	private BigDecimal tot_price;
	private String entry_by;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "id")
	private List<Product> product;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public BigDecimal getTot_price() {
		return tot_price;
	}
	public void setTot_price(BigDecimal tot_price) {
		this.tot_price = tot_price;
	}
	public String getEntry_by() {
		return entry_by;
	}
	public void setEntry_by(String entry_by) {
		this.entry_by = entry_by;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}

}
