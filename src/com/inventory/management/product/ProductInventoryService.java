package com.inventory.management.product;

public interface ProductInventoryService {
	public void addStock(Product product, int quantity); 
	public void reduceStock(Product product, int quantity);
}
