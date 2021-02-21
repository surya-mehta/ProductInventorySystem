package com.inventory.management.payment;

import com.inventory.management.order.Order;

/**
 * this class describes payment details
 * **/
public class Payment {
	private int id;
	private Order order;
	private double amount;
	private String type;
	
	public int id() {
		return this.id;
	}
	public Order order() {
		return this.order;
	}
	public double amount() {
		return this.amount;
	}
	public String type() {
		return this.type;
	}
	
	public Payment(int id, double amount,Order order,String type) {
		super();
		this.id = id;
		this.order = order;
		this.amount = amount;
		this.type = type;
	}

}
