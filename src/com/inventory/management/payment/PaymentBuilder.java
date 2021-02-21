package com.inventory.management.payment;

import com.inventory.management.order.Order;

/**
 * this class used as payment details builder of placed order
 * **/

public class PaymentBuilder {
	private int id;
	private Order order;
	private double amount;
	private String type;
	
	
	private PaymentBuilder(String type) {
		this.type = type;
	}
	public static PaymentBuilder paymentType() {
		return new PaymentBuilder("CASH");
	}
	public PaymentBuilder withId(int id) {
		this.id = id;
		return this;
	}
	public PaymentBuilder order(Order order) {
		this.order = order;
		return this;
	}
	public PaymentBuilder amountPayable(double amount) {
		this.amount = amount;
		return this;
	}
	public Payment build() {
		return new Payment( id, amount, order, type);
	}
	
	
}
