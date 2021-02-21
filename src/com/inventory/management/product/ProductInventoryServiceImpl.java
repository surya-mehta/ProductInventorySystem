package com.inventory.management.product;

import java.util.HashMap;
import java.util.Map;

/**
 * this class used to maintain product stock  
 **/
public class ProductInventoryServiceImpl implements ProductInventoryService{

	private ProductRepository productRepository ;
	private ProductService productService;
	Map<Product,Integer> products = new HashMap<>();
	
	public ProductInventoryServiceImpl(ProductRepository productRepository, ProductService productService
			) {
		super();
		this.productRepository = productRepository;
		this.productService = productService;
	
	}

	
	@Override
	public void addStock(Product product, int quantity) {
		Product prod = productService.productFor(product.id()); 
		if (prod != null && prod.id() != null){
			prod.addQuantityWithStock(quantity);
		}
		
		/**
		 * In case of database , add following value to product table
		 */
		products.put(prod, quantity);
		productRepository.save(product);

	}

	@Override
	public void reduceStock(Product product, int quantity) {
		Product prod = productService.productFor(product.id()); 
		if (prod != null && prod.id() != null){
			prod.reduceQuantityWithStock(quantity);
		}
		
		/**
		 * In case of database , update following value in product table
		 */
		products.put(prod, quantity);
		
	}

}
