package com.inventory.management.order;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * this class used to add orders and to map with details
 * **/

public class OrderHelperService {

	private static final BigDecimal FIVE_THOUSAND_RUPEES = BigDecimal.valueOf(5000.0);

	private static final int QTY_10 = 10;
	private static final String BILL_NUMBER = "12345";

	public static final Order order1 = OrderBuilder.date(new Date()).withId(1).total(FIVE_THOUSAND_RUPEES)
			.withQuantity(QTY_10).billNumber(BILL_NUMBER).user().build();

	private OrderRepository orderRepository;

	public OrderHelperService(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	private static Map<Integer, Order> orders = new HashMap<Integer, Order>() {
		{
			orders.put(order1.getId(), order1);
		}
	};

	public Order orderFor(int orderId) {
		return orderRepository.getOrderDetails(orderId);

	}

}
