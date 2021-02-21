package com.inventory.management.order;

import java.util.HashMap;
import java.util.Map;

import com.inventory.management.product.ProductInventoryService;



/**
 * this class used to place orders and fetch order details with product details
 * **/

public class OrderRepository {
	private Map<Integer, Order> orders = new HashMap<>();
	private ProductInventoryService inventoryService;
	
	
	public void placeOrderMethod(Order order) {
		/**
		 * In case of Database , need to add product in Product table from here
		 */
		orders.put(order.id(), order);
		/**
		 * Reduce quantity in stock after placing order from Product table
		 * **/
		inventoryService.reduceStock(order.product(), order.quantity());
	}
	Order getOrderDetails(int id) {
		/**
		 * In case of Database , need to fetch Order from Order table
		 */
		return orders.get(id);

	}
}
