package com.inventory.management.order;

import com.inventory.management.product.Product;


/**
 * this class used to place orders after getting details from repository and to maintain stock of products
 * **/

public class OrderServiceImpl implements OrderService {

	OrderRepository orderRepository;
	OrderHelperService orderHelperService;

	public OrderServiceImpl(OrderRepository orderRepository, OrderHelperService orderHelperService) {
		super();
		this.orderRepository = orderRepository;
		this.orderHelperService = orderHelperService;
	}

	@Override
	public void placeOrder(int orderID) {
		Order placeOderDetail = orderHelperService.orderFor(orderID);

		orderRepository.placeOrderMethod(placeOderDetail);

		Product product = placeOderDetail.product();
		product.reduceQuantityWithStock(placeOderDetail.quantity());
	}

}
