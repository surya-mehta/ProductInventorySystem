package com.inventory.management.payment;

import java.util.HashMap;
import java.util.Map;

/**
 * this class used to get payment details help payment repository to proceed further for payment gateway
 * **/

public class PaymentHelperService {
	
	public static final Payment PAYMENT = PaymentBuilder.paymentType().withId(1).amountPayable(0.0).build();

	public PaymentHelperService(PaymentRepository paymentRepository) {
		super();
	}

	private static Map<Integer, Payment> paymentMap = new HashMap<Integer, Payment>() {
		{
			put(PAYMENT.id(), PAYMENT);
		}
	};

	public Payment paymentDetails(int id) {
		return paymentMap.get(id);
	}	

}
