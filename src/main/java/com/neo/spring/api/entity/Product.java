package com.neo.spring.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	private int pid;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "qty")
	private int qty;
	@Column(name = "price")
	private int price;

	@ManyToOne(cascade =  CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "cust_id", nullable = false)
	private Customer customer;

	public Product() {

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	public Product(int pid, String productName, int qty, int price) {
		super();
		this.pid = pid;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", qty=" + qty + ", price=" + price + "]";
	}

//	@Override
//	public String toString() {
//		return "Product [pid=" + pid + ", productName=" + productName + ", qty=" + qty + ", price=" + price
//				+ ", customer=" + customer + "]";
//	}

	

}
