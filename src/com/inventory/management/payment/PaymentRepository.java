package com.inventory.management.payment;

import java.util.HashMap;
import java.util.Map;

/**
 * this class is used to connect with payment gateway and insert payment details into database
 * **/
public class PaymentRepository {
	private Map<Integer, Payment> map = new HashMap<>();

	public void payAmount(Payment payment) {
		/**
		 * add payment details into Payment table and call payment external
		 * service
		 **/
		map.put(payment.id(), payment);
	}

}
