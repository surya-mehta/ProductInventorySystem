package com.inventory.management.product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


/**
 * this class is used maintain products and helprepository to provide details of product
 * **/
public class ProductService {

    private static final BigDecimal FIVE_HUNDRED_RUPEES = BigDecimal.valueOf(500.0);
    private static final BigDecimal THOUSAND_RUPEES = BigDecimal.valueOf(1000.0);
    private static final BigDecimal TWO_THOUSAND= BigDecimal.valueOf(2000.0);

	private static final int QTY_10 = 10;

	public static final Product SKIRTS = ProductBuilder.aWomenWear().withId("10001").costing(THOUSAND_RUPEES).withQuantity(QTY_10).build();
	public static final Product PANTS = ProductBuilder.aWomenWear().withId("10002").costing(TWO_THOUSAND).withQuantity(QTY_10).build();
	public static final Product KIDS_TSHIRTS = ProductBuilder.aKidsWear().withId("20001").costing(FIVE_HUNDRED_RUPEES).withQuantity(QTY_10).build();
	public static final Product KIDS_PANTS = ProductBuilder.aKidsWear().withId("20002").costing(THOUSAND_RUPEES).withQuantity(QTY_10).build();
	public static final Product FORMAL_SHIRTS = ProductBuilder.aKidsWear().withId("30001").costing(TWO_THOUSAND).withQuantity(QTY_10).build();
	public static final Product FORMAL_PANTS = ProductBuilder.aKidsWear().withId("30002").costing(TWO_THOUSAND).withQuantity(QTY_10).build();

	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	private static Map<ProductID, Product> products = new HashMap<ProductID, Product>() {
        {
            put(SKIRTS.id(), SKIRTS);
            put(PANTS.id(), PANTS);
            put(KIDS_TSHIRTS.id(), KIDS_TSHIRTS);
            put(KIDS_PANTS.id(), KIDS_PANTS);
            put(FORMAL_SHIRTS.id(), FORMAL_SHIRTS);
            put(FORMAL_PANTS.id(), FORMAL_PANTS);
        }
    };

	public Product productFor(ProductID productID) {
		return products.get(productID);
	}

    public boolean hasEnoughProductsInStock(ProductID productID, int quantity) {
	    return products.get(productID).quantity() >= quantity;
    }
    
    public void save(Product product) {
    	productRepository.save(product);
    }
    
    
}
