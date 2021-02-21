package com.inventory.management.order;

import java.util.Date;

import com.inventory.management.product.Product;
import com.inventory.management.user.User;

/**
 * this class describes order details
 * **/
public class Order {
	private int id;
	private int quantity;
	private double total;
	private Date date;
	private Product product;
	private User user;
	private String billNumber;
	private OrderStatus orderStatus;
	/**
	 * @return the id
	 */

	public int getId() {
		return id;
	}

	public Order(int id, int quantity, double total, Date date, Product product, User user, String billNumber,OrderStatus orderStatus) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.total = total;
		this.date = date;
		this.product = product;
		this.user = user;
		this.billNumber = billNumber;
		this.orderStatus = orderStatus;
	}

	public Integer id() {
		return this.id;
	}

	public Product product() {
		return this.product;
	}
	public int quantity() {
		return this.quantity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Order [id=" + id + ",  quantity=" + quantity + ", total=" + total + ", date=" + date + ", product="
				+ product + ", billNumber=" + billNumber + "]";
	}
}
