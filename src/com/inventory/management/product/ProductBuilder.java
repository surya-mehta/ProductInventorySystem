package com.inventory.management.product;

import java.math.BigDecimal;


/**
 * this class used as product details builder of various products
 * **/

public class ProductBuilder {

	private ProductCategory productCategory = ProductCategory.KIDS_WEAR;
	private ProductID productID = new ProductID("1234");
	private BigDecimal price = BigDecimal.ZERO;
	private int quantity = 0;

	private ProductBuilder(ProductCategory productType) {
		this.productCategory = productType;
	}

	public static ProductBuilder aKidsWear() {
        return new ProductBuilder(ProductCategory.KIDS_WEAR);
    }

	public static ProductBuilder aMenWear() {
		return new ProductBuilder(ProductCategory.MENS_WEAR);
	}
	
	public static ProductBuilder aWomenWear() {
		return new ProductBuilder(ProductCategory.LADIES_WEAR);
	}

    public ProductBuilder withId(String value) {
        this.productID = new ProductID(value);
        return this;
    }

    public ProductBuilder costing(BigDecimal price) {
        this.price = price;
	    return this;
    }

	public ProductBuilder withQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public Product build() {
		return new Product(productID, productCategory, price, quantity);
	}

}
