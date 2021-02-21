package com.inventory.management.order;



/**
 * this class used to get placed orders details
 * **/

public class OrderTrackingService {

	private OrderRepository orderRepository;

	public OrderTrackingService(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	public Order getOrderDetails(int id) {
		return orderRepository.getOrderDetails(id);
	}

}
