package com.inventory.management.product;

import java.util.HashMap;
import java.util.Map;
/**
 * this class used to save product details in database 
 *  * **/
public class ProductRepository {

	    private Map<ProductID, Product> products = new HashMap<>();

	    void save(Product product) {
	    	/**
	    	 * In case of Database , need to add product in Product table from here 
	    	 */
	    	products.put(product.id(), product);
	    }

}
